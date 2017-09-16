grammar AREML;
areml : '{' recognition action? thing? person? connection? property? '}' ;      //Object? Person? Connection? Property?   ;

recognition    :   STRING '={' pair (',' pair)* '}'(',')? ; // empty object
action   :  STRING'={'STRING'={'pair (',' pair)* '},' STRING'={' pair (',' pair)* '}'? '}' (',')?    ;
thing    :   STRING'={'STRING'={'pair (',' pair)*'},' STRING'={' pair (',' pair)* '}' ? '}' (',')?;// empty object
person    :   STRING '={' pair (',' pair)* '}'(',')?  ; // empty object
connection    :   STRING '={' pair (',' pair)*'}' (',')?  (',')? ; // empty object
property    :   STRING '={'pair (',' pair)* '}'(',')?  ; // empty object


pair:   STRING ':' value ;
value    :   STRING    |   NUMBER  ;// recursion

STRING :  '"' (ESC | ~["\\])* '"' ;
Attributes : STRING;
fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

NUMBER
    :   '-'? INT '.' [0-9]+ EXP? // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP             // 1e10 -3e4
    |   '-'? INT                 // -3, 45
    ;
fragment INT :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

WS  :   [ \t\n\r]+ -> skip ;
