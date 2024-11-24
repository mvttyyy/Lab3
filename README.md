C:\Users\mvvtt\.jdks\openjdk-23.0.1\bin\java.exe -Dmaven.multiModuleProjectDirectory=C:\Users\mvvtt\IdeaProjects\MBLab3 -Djansi.passthrough=true "-Dmaven.home=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\plugins\maven\lib\maven3" "-Dclassworlds.conf=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\plugins\maven\lib\maven3\bin\m2.conf" "-Dmaven.ext.class.path=C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\plugins\maven\lib\maven-event-listener.jar" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\lib\idea_rt.jar=56524:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\plugins\maven\lib\maven3\boot\plexus-classworlds-2.8.0.jar;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3\plugins\maven\lib\maven3\boot\plexus-classworlds.license" org.codehaus.classworlds.Launcher -Didea.version=2024.3 test jacoco:report
[INFO] Scanning for projects...
[INFO]
[INFO] -------------------------< org.example:MBLab3 >-------------------------
[INFO] Building MBLab3 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- jacoco:0.8.11:prepare-agent (default) @ MBLab3 ---
[INFO] argLine set to -javaagent:C:\\Users\\mvvtt\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.11\\org.jacoco.agent-0.8.11-runtime.jar=destfile=C:\\Users\\mvvtt\\IdeaProjects\\MBLab3\\target\\jacoco.exec
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ MBLab3 ---
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ MBLab3 ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ MBLab3 ---
[INFO] skip non existing resourceDirectory C:\Users\mvvtt\IdeaProjects\MBLab3\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ MBLab3 ---
[INFO] Nothing to compile - all classes are up to date.
[INFO]
[INFO] --- surefire:3.2.5:test (default-test) @ MBLab3 ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running org.example.ColorTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 s -- in org.example.ColorTest
[INFO] Running org.example.MainTest
Rysowanie figury:
Typ figury: Rectangle
Kolor figury: Red: 255, Green: 0, Blue: 0, Alpha: 0.80

Reprezentacja graficzna:
* * * * 
* * * * 
* * * * 
* * * * 
* * * * 


Rysowanie figury:
Typ figury: Triangle
Kolor figury: Red: 0, Green: 255, Blue: 0, Alpha: 0.60

Reprezentacja graficzna:
 * * * 
* * * * * 


[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.018 s -- in org.example.MainTest
[INFO] Running org.example.RectangleTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s -- in org.example.RectangleTest
[INFO] Running org.example.ShapeDescriberTest
[main] INFO org.example.ShapeDescriber - Shape details:
[main] INFO org.example.ShapeDescriber - Shape type: Triangle
[main] INFO org.example.ShapeDescriber - Shape area: 6.0
[main] INFO org.example.ShapeDescriber - Shape perimeter: 12.0
[main] INFO org.example.ShapeDescriber - Shape color: Red: 0, Green: 255, Blue: 0, Alpha: 0.60

[main] INFO org.example.ShapeDescriber - Shape details:
[main] INFO org.example.ShapeDescriber - Shape type: Rectangle
[main] INFO org.example.ShapeDescriber - Shape area: 20.0
[main] INFO org.example.ShapeDescriber - Shape perimeter: 18.0
[main] INFO org.example.ShapeDescriber - Shape color: Red: 255, Green: 0, Blue: 0, Alpha: 0.80

[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.024 s -- in org.example.ShapeDescriberTest
[INFO] Running org.example.ShapeRendererTest
Rysowanie figury:
Typ figury: Rectangle
Kolor figury: Red: 255, Green: 0, Blue: 0, Alpha: 0.80

Reprezentacja graficzna:
* * * * 
* * * * 
* * * * 
* * * * 
* * * * 


Rysowanie figury:
Typ figury: Triangle
Kolor figury: Red: 0, Green: 255, Blue: 0, Alpha: 0.60

Reprezentacja graficzna:
 * * * 
* * * * * 


[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s -- in org.example.ShapeRendererTest
[INFO] Running org.example.TriangleTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s -- in org.example.TriangleTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 15, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- jacoco:0.8.11:report (default-cli) @ MBLab3 ---
[INFO] Loading execution data file C:\Users\mvvtt\IdeaProjects\MBLab3\target\jacoco.exec
[INFO] Analyzed bundle 'MBLab3' with 7 classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.835 s
[INFO] Finished at: 2024-11-24T13:27:46+01:00
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0

<table class="coverage" cellspacing="0" id="coveragetable">
  <thead>
    <tr>
      <td class="sortable" id="a" onclick="toggleSort(this)">Element</td>
      <td class="down sortable bar" id="b" onclick="toggleSort(this)">Missed Instructions</td>
      <td class="sortable ctr2" id="c" onclick="toggleSort(this)">Cov.</td>
      <td class="sortable bar" id="d" onclick="toggleSort(this)">Missed Branches</td>
      <td class="sortable ctr2" id="e" onclick="toggleSort(this)">Cov.</td>
      <td class="sortable ctr1" id="f" onclick="toggleSort(this)">Missed</td>
      <td class="sortable ctr2" id="g" onclick="toggleSort(this)">Cxty</td>
      <td class="sortable ctr1" id="h" onclick="toggleSort(this)">Missed</td>
      <td class="sortable ctr2" id="i" onclick="toggleSort(this)">Lines</td>
      <td class="sortable ctr1" id="j" onclick="toggleSort(this)">Missed</td>
      <td class="sortable ctr2" id="k" onclick="toggleSort(this)">Methods</td>
      <td class="sortable ctr1" id="l" onclick="toggleSort(this)">Missed</td>
      <td class="sortable ctr2" id="m" onclick="toggleSort(this)">Classes</td>
    </tr>
  </thead>
  <tfoot>
    <tr>
      <td>Total</td>
      <td class="bar">91 of 478</td>
      <td class="ctr2">80%</td>
      <td class="bar">5 of 26</td>
      <td class="ctr2">80%</td>
      <td class="ctr1">7</td>
      <td class="ctr2">36</td>
      <td class="ctr1">19</td>
      <td class="ctr2">93</td>
      <td class="ctr1">2</td>
      <td class="ctr2">23</td>
      <td class="ctr1">1</td>
      <td class="ctr2">7</td>
    </tr>
  </tfoot>
  <tbody>
    <tr>
      <td id="a0"><a href="" class="el_package">org.example</a></td>
      <td class="bar" id="b0">
        <img src="" width="22" height="10" title="91" alt="91">
        <img src="" width="97" height="10" title="387" alt="387">
      </td>
      <td class="ctr2" id="c0">80%</td>
      <td class="bar" id="d0">
        <img src="" width="23" height="10" title="5" alt="5">
        <img src="" width="96" height="10" title="21" alt="21">
      </td>
      <td class="ctr2" id="e0">80%</td>
      <td class="ctr1" id="f0">7</td>
      <td class="ctr2" id="g0">36</td>
      <td class="ctr1" id="h0">19</td>
      <td class="ctr2" id="i0">93</td>
      <td class="ctr1" id="j0">2</td>
      <td class="ctr2" id="k0">23</td>
      <td class="ctr1" id="l0">1</td>
      <td class="ctr2" id="m0">7</td>
    </tr>
  </tbody>
</table>
