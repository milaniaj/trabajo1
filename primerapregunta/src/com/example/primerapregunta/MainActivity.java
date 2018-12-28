package com.example.primerapregunta;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	double a1, b2, c3;
	EditText Texto1,Texto2, Texto3; 
	TextView visto1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Texto1=(EditText)findViewById(R.id.Texto1);
		Texto2=(EditText)findViewById(R.id.Texto2);
		Texto3=(EditText)findViewById(R.id.Texto3);
		visto1=(TextView)findViewById(R.id.textView2);
	}
	public void CALCULAR(View View){
		a1=Double.parseDouble(Texto1.getText().toString());
		b2=Double.parseDouble(Texto2.getText().toString());
		c3=Double.parseDouble(Texto3.getText().toString());
		visto1.setText(Double.toString(a1*b2*c3));
	}
	public void CANCELAR(View View){
		Texto1.setText("");
		Texto2.setText("");
		Texto3.setText("");
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
