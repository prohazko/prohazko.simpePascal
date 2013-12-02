program test

var 
  n: integer, 
  i: integer;

begin
n := 9;
i := 0;

    repeat

      if n % 2 = 0 then
        write n + ' -> even';
      else begin
        write n + ' -> odd';
        i := i + 1;
      end

      n := n - 1;
    until n < 0 ;

write i;
write 'done';
end.