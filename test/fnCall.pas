program test

var x: real, msg:string;

begin
x   := 10;
msg := 'Hello world!';


write  sin(x);
write  cos(x);
write  tan(x);
write atan(x);

inc(x);
write x;

dec(x);
dec(x);
write x;

write sqrt(x);
write power(x, 3);
write ln(x);
write exp(x);

write length(msg);
write copy(msg, 5, 5);
write delete(msg, 5, 5);
write concat('Hello', 'world', '!', ']:<')


end.