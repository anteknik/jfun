"# jfun" 

compile dan hasil compilenya ditaruh ke folder bin 

$ javac src/* -d bin 

menjalankan hasil compile

$ java -cp bin Halo

membuat file jar file

1. membuat manifest dulu di folder bin

	$ echo Main-Class: Halo > manifest.txt
	
	*file yang memuat info mengenai class utama atau main class (ex :Halo.class) dari file java class yg akan dibuat file JAR
	
2. cmd membuat file jar di folder bin

	$ jar cvfm MyFile.jar manifest.txt *.class

3 execute file jar

	$ java -jar MyFile.jar

4. membuka isi file jar
	
	$ jar xf MyFile.jar
