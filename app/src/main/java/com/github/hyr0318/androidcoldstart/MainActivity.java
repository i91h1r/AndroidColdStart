package com.github.hyr0318.androidcoldstart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);

        initView();
    }


    private void initView() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new ItemAdapter(getDate()));
    }


    public List<Item> getDate() {

        List<Item> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Item item = new Item();

            item.setName("ColdStart" + i);

            list.add(item);
        }

        return list;
    }


    private class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
        private List<Item> date;


        public ItemAdapter(List<Item> date) {
            this.date = date;
        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getApplicationContext())
                .inflate(R.layout.item, parent, false);

            return new ViewHolder(view);
        }


        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            holder.textView.setText(date.get(position).getName());
        }


        @Override public int getItemCount() {
            return date.size();
        }


        public class ViewHolder extends RecyclerView.ViewHolder {

            private final TextView textView;


            public ViewHolder(View itemView) {
                super(itemView);
                textView = (TextView) itemView.findViewById(R.id.tv);

            }
        }
    }
}
