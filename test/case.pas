program test


begin
   grade := 'F';

   case (grade) of
      'A' : begin write ('Excellent!' ); end
      'B' : write ('Well done' );
      'D' : write ('You passed' );
      'F' : write ('Better try again' );
   end;     
   
   write ('Your grade is  ' + grade );
   
end.