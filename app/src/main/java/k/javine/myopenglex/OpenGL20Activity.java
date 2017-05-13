package k.javine.myopenglex;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import k.javine.myopenglex.opengl.MyGLSurfaceView;

/**
 * Created by KuangYu on 2016/10/24 0024.
 */
public class OpenGL20Activity extends Activity {

    private GLSurfaceView glSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        glSurfaceView = new MyGLSurfaceView(this);
        setContentView(glSurfaceView);
    }
}
