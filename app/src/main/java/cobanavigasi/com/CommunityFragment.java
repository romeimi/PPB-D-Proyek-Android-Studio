package cobanavigasi.com;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CommunityFragment extends Fragment {

    private CommunityViewModel communityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        communityViewModel=
                ViewModelProviders.of(this).get(CommunityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_community, container, false);
        final TextView textView = root.findViewById(R.id.text_community);
        communityViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
    }


