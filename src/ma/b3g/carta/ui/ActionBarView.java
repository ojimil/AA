package ma.b3g.carta.ui;

import ma.b3g.carta.ContactUs;

import ma.b3g.carta.GetBalance;
import ma.b3g.carta.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ActionBarView extends LinearLayout implements OnClickListener {
	private View mConvertView;

	private ImageButton mButtonSearch;
	//private ImageButton mButtonComment;
	private ImageButton mButtonHome;

	//private ProgressBar mProgressBar;

	private TextView mTitle;

	private OnDispatchClickListener mListenerClick;

	public interface OnDispatchClickListener {
		public void onDispatchClick(int id);
	}

	public ActionBarView(Context context, AttributeSet attrs) {

		super(context, attrs);

		mConvertView = LayoutInflater.from(context).inflate(R.layout.action_bar, this);

		mButtonSearch = (ImageButton) mConvertView.findViewById(R.id.ab_search);
//		mButtonComment = (ImageButton) mConvertView
//				.findViewById(R.id.ab_comment);
		mButtonHome = (ImageButton) mConvertView.findViewById(R.id.ab_home);

		//mProgressBar = (ProgressBar) mConvertView.findViewById(R.id.ab_loading);

		//mTitle = (TextView) mConvertView.findViewById(R.id.ab_title);

		mButtonHome.setOnClickListener(this);
		mButtonSearch.setOnClickListener(this);
//		mButtonComment.setOnClickListener(this);
//		mProgressBar.setOnClickListener(this);

	}

	public void DontClickButtonSearch() {
		// mButtonSearch.setPressed(false);
		
		
	}

	public void DontshowButtonHome() {
		mButtonSearch.setVisibility(View.INVISIBLE);
	}

	public void showButtonSearch() {
		mButtonSearch.setVisibility(View.VISIBLE);
	}

	public void showButtonComment() {
		//mButtonComment.setVisibility(View.VISIBLE);
	}

	public void setTitle(String _t) {
		mTitle.setText(_t);
	}

	public void loading() {
		//mProgressBar.setVisibility(View.VISIBLE);
	}

	public void loaded() {
		//mProgressBar.setVisibility(View.GONE);
	}

	public void onClick(View v) {
		mListenerClick.onDispatchClick(v.getId());
	}

	public void setOnDispatchClickListener(GetBalance ecran2) {
		mListenerClick = ecran2;
	}

	public void setOnDispatchClickListener(ContactUs ecran3) {
		// TODO Auto-generated method stub
		mListenerClick=ecran3;
	}

	

	

}
