package ma.b3g.carta;

import ma.b3g.carta.ui.ActionBarView;
import ma.b3g.carta.ui.ActionBarView.OnDispatchClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ContactUs extends Activity implements OnDispatchClickListener {
	
	private TextView mtvClick3;
	private ActionBarView	mActionBar;
	
	
	private Intent intentToGetBalance;
	private Intent intentToTrancations;
	private Intent intentToSecondary;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_us);
		
		
			mActionBar=((ActionBarView)findViewById(R.id.actionbar));
			mActionBar.showButtonSearch();
			
	        	                
	        
	        mActionBar.setOnDispatchClickListener(this);
		
	        mtvClick3=((TextView)findViewById(R.id.tv_clickEcran3));
		
		
		
		
	}


	@Override
	public void onDispatchClick(int id) {
		// TODO Auto-generated method stub
		
		switch (id) {
		case R.id.img_btn_getbalance: 			
			intentToGetBalance=new Intent(this,GetBalance.class);
			this.startActivity(intentToGetBalance);							
			break;
			
		case R.id.img_btn_transactions: 			
			intentToTrancations=new Intent(this,Transactions.class);
			this.startActivity(intentToTrancations);							
			break;
			
		case R.id.img_btn_secondary: 			
			intentToSecondary=new Intent(this,Secondary.class);
			this.startActivity(intentToSecondary);							
			break;
			

		default:
			break;
		}
		
	}

}
