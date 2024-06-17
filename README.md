LigaZakon

How to run:
char[] source = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
char[] find = {'b', 'c', 'd'};
char[] replace = {'0', '1', '2','3'};

var result = new CharArrayReplacement(source, find, replace).replaceSequence();
System.out.println(result);

How to test:

char[] source = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
char[] find = {'b', 'c'};
char[] replace = {'0', '1', '2'};

Expected result: a012defgh


char[] source = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
char[] find = {'b', 'c', 'd'};
char[] replace = {'0', '1', '2','3'};

Expected result: a0123efgh


