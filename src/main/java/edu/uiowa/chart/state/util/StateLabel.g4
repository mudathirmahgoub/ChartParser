grammar StateLabel;

// parser rules

stateLabel : Identifier actions?;

actions : (action)+ ;

action : ActionType (',' ActionType)*  ':'  actionBody
         {System.out.println($actionBody.text);} ;

actionBody: .*? ;

// lexer rules

ActionType: 'entry' | 'during' | 'exit' ;

Identifier : IdentifierLetter (IdentifierLetter | Digit)* ;

IdentifierLetter : 'a'..'z'|'A'..'Z'|'_' ;

fragment Digit : '0'..'9' ;

LineComment : '%' .*? '\n' -> skip ;

WhiteSpace : [ \t\n\r]+ -> skip ;

AnyCharacter : . ;