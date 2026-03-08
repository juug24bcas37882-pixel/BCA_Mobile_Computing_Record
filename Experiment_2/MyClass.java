package com.example.Experiment2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyClass extends View {

    Paint paint;

    public MyClass(Context context) {
        super(context);
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
        canvas.drawLine(50,50,400,50,paint);

        paint.setColor(Color.CYAN);
        canvas.drawRect(50,100,400,250,paint);

        paint.setColor(Color.GREEN);
        canvas.drawCircle(200,400,100,paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawOval(50,550,400,700,paint);

        paint.setColor(Color.BLACK);
        paint.setTextSize(40);
        canvas.drawText("Graphic Primitives",80,800,paint);
    }
}