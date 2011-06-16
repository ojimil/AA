package ma.b3g.carta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Autenticate extends Activity implements OnClickListener {

	Button btnLogOn;
	EditText txtLogin;
	EditText txtPass;
	Toast monToast;
	Intent intentToEcran2;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.autenticate);

		btnLogOn = ((Button) this.findViewById(R.id.button1));
		txtLogin = ((EditText) this.findViewById(R.id.editText1));
		txtPass = ((EditText) this.findViewById(R.id.editText2));

		btnLogOn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		intentToEcran2 = new Intent(this, GetBalance.class);
		if (txtLogin.getText().toString().equals("Login")
				&& txtPass.getText().toString().equals("Pass")) {

			this.startActivity(intentToEcran2);
		} else {
			monToast = Toast.makeText(Autenticate.this.getApplicationContext(),
					"ERROR", Toast.LENGTH_SHORT);
			monToast.show();
		}

	}
}