package com.bhattaraibikash.recyclerviewassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
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
        MailList mailList = mailLists.get(position);
        holder.ciProfile.setImageResource(mailList.getImgId());
        holder.tvMailTitle.setText(mailList.getMailTitle());
        holder.tvMessage.setText(mailList.getMessage());
        holder.tvTime.setText(mailList.getTime());

    }

    @Override
    public int getItemCount() {
        return mailLists.size();
    }

    public class MailListHolder extends RecyclerView.ViewHolder {

        CircleImageView ciProfile;
        TextView tvMailTitle, tvMessage, tvTime;

        public MailListHolder(@NonNull View itemView) {
            super(itemView);
            ciProfile = itemView.findViewById(R.id.ciProfile);
            tvMailTitle = itemView.findViewById(R.id.tvMailTitle);
            tvMessage = itemView.findViewById(R.id.tvMessage);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }
}
