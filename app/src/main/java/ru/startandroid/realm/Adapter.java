package ru.startandroid.realm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zhangali on 27.12.16.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.UserHolder>{
    private List<Users> usersList;

    public class UserHolder extends RecyclerView.ViewHolder{
        private TextView name, surname;
        private Button btnSend;

        public UserHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.tv_name);
            surname = (TextView) itemView.findViewById(R.id.tv_surname);
            btnSend = (Button) itemView.findViewById(R.id.btn_send);
        }
    }

    public Adapter(List<Users> usersList){
        this.usersList = usersList;
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv, parent, false);

        return new UserHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {
        Users user = usersList.get(position);
        holder.name.setText(user.getName());
        holder.surname.setText(user.getSurname());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }


}
