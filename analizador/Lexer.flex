package analizador;
import static analizador.Tokens.*;
%%
%class Lexer
%type Tokens
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
for |
do |
if |
else |
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"\(" {lexeme=yytext(); return ParentesisAbertura;}
"\)" {lexeme=yytext(); return ParentesisCierre;}
 . {return ERROR;}


