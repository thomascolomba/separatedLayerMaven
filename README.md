# separatedLayerMaven

This project intends to show how to separate layers 
<ul>
	<li>business features</li>
	<li>business objects</li>
	<li>dao</li>
	<li>controller</li>
</ul>

<div>
	Maven is used to manage each layer.
</div>
<div>
	to run : 
	<ol>
		<li>'mvn clean install' the maven project separatedMavenLayer</li>
		<li>Run the generated war file in Tomcat</li>
		<li>Run the client class TestMessageSender through Eclipse. The client reads msg1, write msg3 then reads msg3s.</li>
	</ol>
</div>
