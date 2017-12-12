grammar AREMLVID;
//aremlvid  :  ARTICLE person STRING? action connectionType? ARTICLE? secondobject? |ARTICLE person STRING? action connectionType? ARTICLE? object? and? connectionType? ARTICLE? secondobject; // e.g.switch on the light
aremlvid : ARTICLE STRING? person STRING? action connectionType ARTICLE object|ARTICLE STRING? person ARTICLE? action ARTICLE STRING? object connectionType STRING secondobject|
ARTICLE STRING? person STRING? action connectionType ARTICLE object secondconnectiontype ARTICLE STRING secondobject;

ARTICLE : 'the' | 'an' | 'a' ;
connectionType: 'on'|'in'|'under'|'next to'|'in front of'|'behind'|'with'|'into'|'in to'|'down'|'up'|'to'|'from';
secondconnectiontype: 'on'|'in'|'under'|'next to'|'in front of'|'behind'|'with'|'into'|'in to'|'down'|'up'|'to'|'from';

and: STRING;
person:STRING;
action: STRING;
object: STRING;
secondobject: STRING;

STRING:('a'..'z'|'A'..'Z')+;
WS : [ \t\r\n]+ -> skip ;