package ma.b3g.carta;

import ma.b3g.carta.ui.ActionBarView;
import ma.b3g.carta.ui.ActionBarView.OnDispatchClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Secondary extends Activity implements OnDispatchClickListener, OnClickListener  {
	
	private ActionBarView mActionBar;
	private TextView mTvClick;

	private Intent intentToTransactions;
	private Intent intentToGetBalance;
	private Intent intentToContactUs;
	//private RelativeLayout brancheLayout;
	private LinearLayout layout1;
	private LinearLayout layout2;
	private LinearLayout layout3;
	private LinearLayout layout4;
	private LinearLayout layout5;	
	private LinearLayout layout6;

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
		
		
		layout1=((LinearLayout)findViewById(R.id.branche1));
		layout1.setOnClickListener(this);

		
		layout2=((LinearLayout)findViewById(R.id.branche2));
		layout2.setOnClickListener(this);
		
		layout3=((LinearLayout)findViewById(R.id.branche3));
		layout3.setOnClickListener(this);

		
		layout4=((LinearLayout)findViewById(R.id.branche4));
		layout4.setOnClickListener(this);
		
		layout5=((LinearLayout)findViewById(R.id.branche5));
		layout5.setOnClickListener(this);
		
		layout6=((LinearLayout)findViewById(R.id.branche6));
		layout6.setOnClickListener(this);			
		
	}

	/***********************************************************************************************/
	/************************* Fonction de gestion de redirection de l'action bar  *****************/
	/***********************************************************************************************/
	
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
	
	/***********************************************************************************************/
	/************************* Fonction de gestion de click sur nos les 6 branches *****************/
	/***********************************************************************************************/

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		int i=arg0.getId();
		
		switch (i) {
		case R.id.branche1:
			Toast.makeText(this,"branche1",Toast.LENGTH_SHORT).show();	
			break;
		
		case R.id.branche2:
			Toast.makeText(this,"branche2",Toast.LENGTH_SHORT).show();	
			break;	
			
		case R.id.branche3:
			Toast.makeText(this,"branche3",Toast.LENGTH_SHORT).show();	
			break;
		
		case R.id.branche4:
			Toast.makeText(this,"branche4",Toast.LENGTH_SHORT).show();	
			break;
			
		case R.id.branche5:
			Toast.makeText(this,"branche5",Toast.LENGTH_SHORT).show();	
			break;		
			
		case R.id.branche6:
			Toast.makeText(this,"branche6",Toast.LENGTH_SHORT).show();	
			break;	
			
		default:
			break;
		}
		
		
		
//		String s=Integer.toString(i);
//		Toast.makeText(this, s,Toast.LENGTH_SHORT).show();
		
	}

}
