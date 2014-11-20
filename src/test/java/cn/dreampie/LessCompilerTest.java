package cn.dreampie;

import cn.dreampie.resource.LessSource;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.io.File;
import java.net.URL;

public class LessCompilerTest {

  @Test
  public void testCompile() throws Exception {
    File input = new File(getClass().getResource("/test.less").getPath());
    LessSource lessSource = new LessSource(input);
    LessCompiler lessCompiler = new LessCompiler();
    lessCompiler.setCompress(false);

    File output = new File(input.getAbsolutePath().replace(".less", ".css"));
    lessCompiler.compile(lessSource, output);
  }
}