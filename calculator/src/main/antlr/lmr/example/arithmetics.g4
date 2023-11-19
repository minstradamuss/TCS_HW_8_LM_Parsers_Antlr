grammar arithmetics;

s:
    (a EQQ | e EQQ);

e:
    (
    id | int | OPEN e CLOSE |
    id operation e | int operation e | OPEN e CLOSE operation e
    );

a:
    (id EQUAL e);


operation:
    OPERATION;

id:
    ID;

int:
    INT;

EQQ: ';';
OPERATION: '*'|'+';
OPEN: '(';
CLOSE: ')';
ID: [a-zA-Z] [a-zA-Z_0-9]*;
INT: '0'|[1-9][0-9]*;
EQUAL: '=';