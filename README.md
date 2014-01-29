
term project for Compiler construction class
```
+--simplePascal  
   +--src
      +--edu.simplepascal
         +--antlr      # ANTLR-generated
         +--lang       # Application code
          --Main.java 
   +--test             # Some test cases
    --SimplePascal.g4  # Grammar
```

Requires JDK 1.7

#### ANTLR parsers generation
`java -jar antlr-4.1-complete.jar -o src\edu\simplepascal\antlr -visitor SimplePascal.g4`

#### Compilation
```cmd
mkdir out
dir /s /B *.java > sources.txt
javac -cp ".;antlr-4.1-complete.jar" -d out @sources.txt
rm sources.txt
```

#### Run
`java -classpath .;out;antlr-4.1-complete.jar edu.simplepascal.Main   <source_file.pas>`
