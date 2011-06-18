package ma.b3g.carta;

import ma.b3g.carta.ui.ActionBarView;
import ma.b3g.carta.ui.ActionBarView.OnDispatchClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondary extends Activity implements OnDispatchClickListener  {
	
	private ActionBarView mActionBar;
	private TextView mTvClick;

	private Intent intentToTransactions;
	private Intent intentToGetBalance;
	private Intent intentToContactUs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondary);
		
		
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

		case R.id.img_btn_getbalance:
			intentToGetBalance = new Intent(this, GetBalance.class);
			this.startActivity(intentToGetBalance);
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
