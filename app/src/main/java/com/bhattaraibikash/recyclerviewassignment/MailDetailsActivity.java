package com.bhattaraibikash.recyclerviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MailDetailsActivity extends AppCompatActivity {

    CircleImageView ciProfileDetail;
    TextView tvMailtitleDetail, tvMessageDetail, tvTimeDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_details);

        ciProfileDetail = findViewById(R.id.ciProfileDetails);
        tvMailtitleDetail = findViewById(R.id.tvMailTitleDetail);
        tvMessageDetail = findViewById(R.id.tvMessageDetail);
        tvTimeDetail = findViewById(R.id.tvTimeDetail);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            ciProfileDetail.setImageResource(bundle.getInt("image"));
            tvMailtitleDetail.setText(bundle.getString("title"));
            tvMessageDetail.setText(bundle.getString("message"));
            tvTimeDetail.setText(bundle.getString("time"));
        }

    }
}
