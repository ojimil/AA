package ma.b3g.carta;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
	Intent intentToGetBalance;
	ProgressDialog dialog;
	Thread thread;
	Handler handler;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.autenticate);

		btnLogOn = ((Button) this.findViewById(R.id.button1));
		txtLogin = ((EditText) this.findViewById(R.id.editText1));
		txtPass = ((EditText) this.findViewById(R.id.editText2));

		dialog = new ProgressDialog(this);
		dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		// dialog.setOnCancelListener(this);
		dialog.setMessage("Loading...");
		dialog.setCancelable(true);
		dialog.setMax(100);

		btnLogOn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		dialog.show();
		compute();

	}

	
	// thread : appel web service
	// communique un résultat (0) au handler
	// handler : interface entre thread & thread principal en l occurence
	// Authenticate
	// si tout se passe bien valeur 0 appel de la méthode go
	// go() : affichage de getbalance

	private void compute() {
		handler = new Handler() {
			public void handleMessage(Message msg) {
				switch (msg.what) {
				case 0:
					dialog.incrementProgressBy(1);
					goToGetBalance();
					break;

				case 1:
					dialog.dismiss();
					break;
				case 2:
					Toast.makeText(Autenticate.this.getApplicationContext(),
							"try again", Toast.LENGTH_SHORT).show();
					break;

				}
			}
		};

		thread = new Thread() {
			public void run() {
				try {
					// Appel web service Authenticate
					if (txtLogin.getText().toString().equals("Login")
							&& txtPass.getText().toString().equals("Pass")) {
						handler.sendMessage(handler.obtainMessage(0, ""));
					}

					else {
						handler.sendEmptyMessage(2);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

				handler.sendEmptyMessage(1);
			};
		};
		thread.start();

	}
	private void goToGetBalance() {
		intentToGetBalance = new Intent(this, GetBalance.class);
		this.startActivity(intentToGetBalance);
	}

}