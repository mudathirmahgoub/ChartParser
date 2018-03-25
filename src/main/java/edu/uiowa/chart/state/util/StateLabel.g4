grammar StateLabel;

// parser rules

stateLabel : Identifier '\r'? '\n'* actions?;

actions : (action)+ ;

action : actionType (',' actionType)*  ':'  actionBody
         | 'bind'  ':' Identifier? (',' Identifier)* ;

actionType: Entry
            | During
            | Exit
            | On Identifier
            | On After '(' Float ',' Identifier ')'
            | On Before '(' Float ',' Identifier ')'
            | On At '(' Float ',' Identifier ')'
            | On Every '(' Float ',' Identifier ')'
            ;

actionBody: (.| '\r'? '\n')*? ;

// lexer rules

Entry : 'entry' | 'en' ;

During : 'during' | 'du' ;

Exit : 'exit' | 'ex' ;

On : 'on' ;

After : 'after' ;

Before : 'before' ;

At : 'at' ;

Every : 'every' ;

Identifier : IdentifierLetter (IdentifierLetter | Digit)* ;

IdentifierLetter : 'a'..'z'|'A'..'Z'|'_' ;

Integer : Digit+ ;

Float   : Digit+ '.' Digit*
          | '.' Digit+ ;

Digit : '0'..'9' ;

LineComment : '%' .*? '\n' -> skip ;

WhiteSpace : [ \t\r]+ -> skip ;

AnyCharacter : . ;