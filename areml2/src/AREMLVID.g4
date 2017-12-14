grammar AREMLVID;
//aremlvid  :  ARTICLE person STRING? action connectionType? ARTICLE? secondobject? |ARTICLE person STRING? action connectionType? ARTICLE? object? and? connectionType? ARTICLE? secondobject; // e.g.switch on the light
aremlvid : ARTICLE STRING? person verb? action connectionType ARTICLE object|ARTICLE STRING? person ARTICLE? action ARTICLE STRING? object connectionType gender? STRING? secondobject|
ARTICLE STRING? person verb? action connectionType ARTICLE object secondconnectiontype ARTICLE gender? STRING? secondobject;

ARTICLE : 'the' | 'an' | 'a' ;
verb:'is'|'are';
connectionType: 'on'|'in'|'under'|'next to'|'in front of'|'behind'|'with'|'into'|'in to'|'down'|'up'|'to'|'from';
secondconnectiontype: 'on'|'in'|'under'|'next to'|'in front of'|'behind'|'with'|'into'|'in to'|'down'|'up'|'to'|'from';
gender: 'his'| 'her';

and: STRING;
person:STRING;
action: STRING;
object: STRING;
secondobject: STRING;

STRING:('a'..'z'|'A'..'Z')+;
WS : [ \t\r\n]+ -> skip ;