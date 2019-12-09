package com.bhattaraibikash.recyclerviewassignment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MailListAdapter extends RecyclerView.Adapter<MailListAdapter.MailListHolder>{

    Context context;
    List<MailList> mailLists;

    public MailListAdapter(Context context, List<MailList> mailLists) {
        this.context = context;
        this.mailLists = mailLists;
    }

    @NonNull
    @Override
    public MailListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_mail, parent, false);
        return new MailListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MailListHolder holder, int position) {
        final MailList mailList = mailLists.get(position);
        holder.ciProfile.setImageResource(mailList.getImgId());
        holder.tvMailTitle.setText(mailList.getMailTitle());
        holder.tvMessage.setText(mailList.getMessage());
        holder.tvTime.setText(mailList.getTime());
        holder.layMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MailDetailsActivity.class);

                intent.putExtra("image", mailList.getImgId());
                intent.putExtra("title", mailList.getMailTitle());
                intent.putExtra("message", mailList.getMessage());
                intent.putExtra("time", mailList.getTime());

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mailLists.size();
    }

    public class MailListHolder extends RecyclerView.ViewHolder {

        CircleImageView ciProfile;
        TextView tvMailTitle, tvMessage, tvTime;
        ConstraintLayout layMail;

        public MailListHolder(@NonNull View itemView) {
            super(itemView);
            ciProfile = itemView.findViewById(R.id.ciProfile);
            tvMailTitle = itemView.findViewById(R.id.tvMailTitle);
            tvMessage = itemView.findViewById(R.id.tvMessage);
            tvTime = itemView.findViewById(R.id.tvTime);
            layMail = itemView.findViewById(R.id.layMail);
        }
    }
}
