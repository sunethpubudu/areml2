grammar AREMLVID;
aremlvid  :  ARTICLE person STRING? action connectionType? ARTICLE? secondobject? |ARTICLE person STRING? action connectionType? ARTICLE? object? and? connectionType? ARTICLE? secondobject; // e.g.switch on the light

ARTICLE : 'the' | 'an' | 'a' ;
connectionType: 'on'|'in'|'under'|'next to'|'in front of'|'behind'|'with'|'into'|'in to'|'down'|'up'|'to'|'from';

and: STRING;
person:STRING;
action: STRING;
object: STRING;
secondobject: STRING;

STRING:('a'..'z'|'A'..'Z')+;
WS : [ \t\r\n]+ -> skip ;