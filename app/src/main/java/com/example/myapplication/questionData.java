package com.example.myapplication;

public class questionData {
    public    static  String name="";
    public static  int Finalscore=0;
    public static String email="";
    public static  int Cscore=0;
    public  static  String question[]={
      "Who developed C language?",
            "Which of the following is not a storage class",
            "A structure is a",
            "C is a _____ language",
            "What is  the default return type of function?",
            "Which of the following are tokens in C",
            "Which symbol is used as a statement terminator in C",
            "Character constants should be enclosed",
            "The operator && is an example for ___ operator",
            "The operator & is used for"

    };
    public static  String choices[][] ={
            {"Ken Thomson", "Peter Norton", "Von Neuman", "Dennis Ritchie"},
            {"Auto", "Static", "Register","Extern"},
            {"Scalar data type", "Derived data type", "Primitive data type", "None of these"},
            {"High Level", "Low Level","Middle Level","Machine Level"},
            { "void", "char", "int", "float"},
            {"Keywords", "Variables", "Constants", "All of the above"},
            {  "!","#", "~",";"},
            { "Single quotes",
                    "Double quotes",
                    "Both a and b",
                    "None of these"},
            { "Assignment ",
                    "Increment ",
                    "Logical",
                    "Rational"},
            { "Bitwise AND",
            "Bitwise OR",
            "Logical AND",
            "Logical OR"}


    };
     public static  String correctAnswer[]={
             "Dennis Ritchie",
             "Auto",
             "Derived data type",
             "Middle Level",
             "int",
             "All of the above",
             ";",
             "Single quotes",
             "Logical",
             "Bitwise AND"
     };
    public  static  String questionForCPP[]={
            "C++ was developed by",
            "What is a generic class",
            "What is the size of int?",
            "Which of the following is not a type of Constructor in C++",
            "Which of the following approach is used in C++",
            "What is Inheritance in C++?",
            "What is meant by a polymorphism in C++?",
            "Identify the scope resolution operator",
            "When can an inline function be expanded",
            " The default access specifer for the class members is"

    };
    public static  String choicesForCPP[][] ={
            { "Thomas Kushz", "John Kemney", "Bjarne Stroustrup", "James Golin"},
            { "Function template", "Class template", "Inherited class", "None of the above"},
            { "2", "4", "8", "Compiler dependent"},
            { "Default constructor", "Parameterized constructor", "Copy constructor", "Friend constructor"},
            {  "Left-right", "Right-left", "Bottom-up", "Top-down"},
            { "Deriving new classes from existing classes",
                    "Overloading of classes",
                    "Classes with same names",
                    "Wrapping of data into a single classes"},
            {  "class having only single form",
                    "class having four forms",
                    "class having many forms",
                    "class having two forms"},
            {    ":",
                    "::",
                    "?",
                    "None"},
            {  "Runtime",
                    "Compile time",
                    "Never gets expanded",
                    "All of the above"},
            { "public",
                    "private",
                    "protected",
                    "None of all above"}


    };
    public static  String correctAnswerForCPP[]={
            "Bjarne Stroustrup",
            "Class template",
            "Compiler dependent",
            "Friend constructor",
            "Bottom-up",
            "Deriving new classes from existing classes",
            "class having many forms",
            "::",
            "Compile time",
            "private"
    };
    public  static  String questionForjava[]={
            "How do you insert COMMENTS in Java",
            "Numbers of primitive data types in Java are?",
            "What is the size of float and double in Java",
            "Select the valid statement",
            "Arrays in Java are-",
            "What is the object created with new keyword?",
            "In which of the following is toString() method defined?",
            "compareTo() returns",
            "What is the implicit return type of constructor",
            "What is Runnable"
    };
    public static  String choicesForJava[][] ={
            { "//This is a comment",
                    "#This is a comment",
                    "/*This is a comment",
                    "///This is a comment"},
            { "6",
                    "7",
                    "8",
                    "9"},
            { "32 and 64",
                    "32 and 32",
                    "64 and 64",
                    "64 and 32"},
            { "char[] ch=new char(5)",
                    "char[] ch=new char[5]",
                    "char[] ch=new char()",
                    "char[] ch=new char[]"},
            {"Object references",
                    "Object",
                    "Primitive data types",
                    "None"},
            { "At run time",
                    "At compile time",
                    "Depends on the code",
                    "None"},
            { "java.lang.Object",
                    "java.lang.String",
                    "java.lang.util",
                    "none"},
            { "True",
                    "False",
                    "An int value",
                    "None"},
            { "No return type",
                    "A class object in which it is defined",
                    "void",
                    "None"},
            { "Abstract class",
                    "Class",
                    "Method",
                    "Interface"}



    };
    public static  String correctAnswerForJava[]={
            "//This is a comment",
            "8",
            "32 and 64",
            "char[] ch=new char[5]",
            "Object",
            "At run time",
            "java.lang.Object",
            "An int value",
            "A class object in which it is defined",
            "Interface"

    };
    public  static  String questionForOS[]={
            "Which of the following is not an operating system",
            "When was the first operating system developed",
            "What else is a command interpreter called?",
            "What is the full name of FAT?",
            "When does page fault occur?",
            "Banker's algorithm is used?",
            "What is the Linux operating system?",
            "What is the full name of DSM?",
            "What type of scheduling is round-robin scheduling",
            "Which of the following OS runs on the server",
    };
    public static  String choicesForOS[][] ={
            { "Windows", "Linux", "Oracle", "DOS"},
            { "1948", "1949", "1950", "1951"},
            { "prompt", "kernel", "command", "shell"},
            { "File attribute table", "File allocation table", "Font attribute table", "Format allocation table"},
            {  "The page does not present in memory.", "The deadlock occur.", "The page is present in memory.", "The buffering occurs."},
            { "To prevent deadlock", "To deadlock recovery", "To solve the deadlock", "None of these"},
            { "Private operating system",
                    "Windows operating system",
                    "Open-source operating system",
                    "None of these"},
            { "Direct system module",
                    "Distributed shared memory",
                    "Demoralized system memory",
                    "Direct system memory"},
            { "Linear data scheduling",
                    "Non-Linear data scheduling",
                    "Preemptive scheduling",
                    "Non-Preemptive scheduling"},
            { "Batch OS",
                    "Distributed OS",
                    "Real-time OS",
                    "Network OS"}



    };
    public static  String correctAnswerForOS[]={
            "Oracle",
            "1950",
            "shell",
            "File allocation table",
            "The page does not present in memory.",
            "To prevent deadlock",
            "Open-source operating system",
            "Distributed shared memory",
            "Preemptive scheduling",
            "Network OS"


    };
    public  static  String questionForCN[]={
            "What is the 2nd layer of the OSI model?",
            "How long is an IPv6 address",
            "Where is a hub specified in the OSI model",
            "Select the wrong data communication system component",
            "OSI model means",
            "Select the correct cable that transport signals in the form of light",
            "Number of Unguided Media is",
            "Error detection at the data link level is achieved by",
            "The first Network was called",
            "The topology with highest reliability is"

    };
    public static  String choicesForCN[][] ={
            {  "Datalink", "Physical", "Internet", "Presentation"},
            {  "32 bits", "128 bits", "64 bits", "128 bytes"},
            {  "Session layer", "Physical layer", "Data Link layer", "Application layer"},
            {   "Protocol", "Medium", "Transits", "Receiver"},
            { "Operating source interconnection", "Open source interconnection",
                    "Operating systems interconnection",
                    "Open systems interconnection"},
            { "Shielded Twisted Pair cable",
                    "Coaxial cable",
                    "Twisted-Pair cable",
                    "Fiber optic cable"},
            { "3", "4", "8", "5"},
            {  "Equalization",
                    "Bit Stuffing",
                    "Cyclic Redundancy Code",
                    "Hamming Code"},
            { "CNNET ",
                    "NSFNET",
                    "ASAPNET",
                    "ARPANET"},
            { "Star topology",
                    "Bus topology",
                    "Mesh topology",
                    "Ring topology"}

    };
    public static  String correctAnswerForCN[]={
            "Datalink",
            "128 bits",
            "Physical layer",
            "Transits",
            "Open systems interconnection",
            "Fiber optic cable",
            "3",
            "Cyclic Redundancy Code",
            "ARPANET",
            "Star topology",


    };
    public  static  String questionForMP[]={
            "Microprocessor consists of",
            "ALE stands for",
            "A machine language instruction format consists of",
            "Which of the following is not a microprocessor",
            "Which of the following is a property of RST 7.5 interrupt",
            "Which of the following flag is used to mask INTR interrupt",
            "8085 microprocessor has how many pins?",
            "What is SIM",
            "Which of following load the stack pointer",
            "In 8086,Example for Non maskable interrupt are",
    };
    public static  String choicesForMP[][] ={
            { "ALU", "Register array", "Control", "All of the above"},
            { "Address latch enable", "Address level enable", "Address leak enable", "Address leak extension"},
            {  "Operation field", "Operation code field & operand field", "Operand field", "None of the mentioned"},
            { "Z8000", "Motorola 6809", "Zilog Z8", "PIC1"},
            {  "It is a non-maskable interrupt", "It has 3rd highest priority", "It uses level-triggered signal", "Its vectored address is 003C H"},
            { "Zero flag", "Auxiliary carry flag", "Interrupt flag", "Sign flag"},
            {   "41", "40", "30", "39"},
            {   "Set interrupt mask", "Sorting interrupt mask", "Select interrupt mask",
                    "None of these"},
            { "BGT",
                    "LDS",
                    "BHS",
                    "RTS"},
            {  "RST 6.5",
                    "INTR",
                    "RST 6.6",
                    "TRAP"}
    };
    public static  String correctAnswerForMP[]={
            "All of the above",
            "Address latch enable",
            "Operand field",
            "PIC1",
            "Its vectored address is 003C H",
            "Interrupt flag",
            "40",
            "Set interrupt mask",
            "LDS",
            "TRAP"
    };



}
