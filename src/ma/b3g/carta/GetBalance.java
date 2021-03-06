package ma.b3g.carta;

import ma.b3g.carta.ui.ActionBarView;
import ma.b3g.carta.ui.ActionBarView.OnDispatchClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GetBalance extends Activity implements OnDispatchClickListener {

	private ActionBarView mActionBar;
	private TextView mTvClick;

	private Intent intentToTransactions;
	private Intent intentToSecondary;
	private Intent intentToContactUs;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get_balance);

		mActionBar = ((ActionBarView) findViewById(R.id.actionbar));
		mActionBar.showButtonSearch();

		// mActionBar.setTitle("Action !");
		// mActionBar.showButtonComment();
		// mActionBar.loading();

		mActionBar.setOnDispatchClickListener(this);

		mTvClick = (TextView) findViewById(R.id.tvClick);

	}

	@Override
	public void onDispatchClick(int id) {
		// TODO Auto-generated method stub
		switch (id) {

		case R.id.img_btn_transactions:
			intentToTransactions = new Intent(this, Transactions.class);
			this.startActivity(intentToTransactions);
			break;

		case R.id.img_btn_secondary:
			intentToSecondary = new Intent(this, Secondary.class);
			this.startActivity(intentToSecondary);
			break;

		case R.id.img_btn_contactus:
			intentToContactUs = new Intent(this, ContactUs.class);
			this.startActivity(intentToContactUs);
			break;

		default:
			break;
		}

	}

}
