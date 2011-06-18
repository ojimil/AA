package ma.b3g.carta.ui;

import ma.b3g.carta.ContactUs;
import ma.b3g.carta.GetBalance;
import ma.b3g.carta.R;
import ma.b3g.carta.Secondary;
import ma.b3g.carta.Transactions;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarView extends LinearLayout implements OnClickListener {
	private View mConvertView;

	private ImageButton mButtonGetBalance;
	private ImageButton mButtonTransactions;
	private ImageButton mButtonSecondary;
	private ImageButton mButtonContactUs;
	// private ImageButton mButtonComment;

	// private ProgressBar mProgressBar;

	private TextView mTitle;

	private OnDispatchClickListener mListenerClick;

	public interface OnDispatchClickListener {
		public void onDispatchClick(int id);
	}

	
	public ActionBarView(Context context, AttributeSet attrs) {

		super(context, attrs);

		mConvertView = LayoutInflater.from(context).inflate(
				R.layout.action_bar, this);

		mButtonGetBalance = (ImageButton) mConvertView
				.findViewById(R.id.img_btn_getbalance);
		mButtonTransactions = (ImageButton) mConvertView
				.findViewById(R.id.img_btn_transactions);
		mButtonSecondary = (ImageButton) mConvertView
				.findViewById(R.id.img_btn_secondary);
		mButtonContactUs = (ImageButton) mConvertView
				.findViewById(R.id.img_btn_contactus);

		mButtonGetBalance.setOnClickListener(this);
		mButtonContactUs.setOnClickListener(this);
		mButtonTransactions.setOnClickListener(this);
		mButtonSecondary.setOnClickListener(this);

	}

	public void DontClickButtonSearch() {
		// mButtonSearch.setPressed(false);

	}

	public void DontshowButtonHome() {
		mButtonContactUs.setVisibility(View.INVISIBLE);
	}

	public void showButtonSearch() {
		mButtonContactUs.setVisibility(View.VISIBLE);
	}

	public void showButtonComment() {
		// mButtonComment.setVisibility(View.VISIBLE);
	}

	public void setTitle(String _t) {
		mTitle.setText(_t);
	}

	public void loading() {
		// mProgressBar.setVisibility(View.VISIBLE);
	}

	public void loaded() {
		// mProgressBar.setVisibility(View.GONE);
	}

	public void onClick(View v) {
		mListenerClick.onDispatchClick(v.getId());
	}

	public void setOnDispatchClickListener(GetBalance ecran2) {
		mListenerClick = ecran2;
	}

	public void setOnDispatchClickListener(ContactUs ecran3) {
		// TODO Auto-generated method stub
		mListenerClick = ecran3;
	}

	public void setOnDispatchClickListener(Transactions transactions) {
		// TODO Auto-generated method stub
		mListenerClick = transactions;
		
	}

	public void setOnDispatchClickListener(Secondary secondary) {
		// TODO Auto-generated method stub
		mListenerClick = secondary;
		
	}

}
