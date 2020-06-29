package com.example.bhavproject.MVVMPattern;
 
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.bhavproject.R;
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private CustomerTrackingResponse modelList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, address, city;
 
        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.title);
            address = (TextView) view.findViewById(R.id.genre);
            city = (TextView) view.findViewById(R.id.year);
        }
    }
 
 
    public MoviesAdapter(CustomerTrackingResponse modelList) {
        this.modelList = modelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
 
        return new MyViewHolder(itemView);
    }
 
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.name.setText(""+modelList.getData().getActivities().get(position).getTitle());
        holder.address.setText(""+modelList.getData().getActivities().get(position).getDescription());
        holder.city.setText(""+modelList.getData().getActivities().get(position).getType());

    }
 
    @Override
    public int getItemCount() {
        return modelList.getData().getActivities().size();
    }
}