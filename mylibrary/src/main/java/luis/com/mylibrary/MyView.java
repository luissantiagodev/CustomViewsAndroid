package luis.com.mylibrary;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Luis Santiago on 8/23/18.
 */
public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);
        initialize(context);
    }

    public MyView (Context context , AttributeSet attributeSet){
        super(context , attributeSet);
        initialize(context);
    }


    private void initialize(Context context){
        inflate(context , R.layout.my_view , this);
    }

}
