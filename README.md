<h4>LigaZakon</h4>

<h4>How to run:</h4>
char[] source = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};<br>
char[] find = {'b', 'c', 'd'};<br>
char[] replace = {'0', '1', '2','3'};<br>
<br>
var result = new CharArrayReplacement(source, find, replace).replaceSequence();<br>
System.out.println(result);<br>
<br>
<h4>How to test:</h4>
<br>
char[] source = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};<br>
char[] find = {'b', 'c'};<br>
char[] replace = {'0', '1', '2'};<br>
<br>
Expected result: a012defgh<br>
<br>
char[] source = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};<br>
char[] find = {'b', 'c', 'd'};<br>
char[] replace = {'0', '1', '2','3'};<br>
<br>
Expected result: a0123efgh<br>


