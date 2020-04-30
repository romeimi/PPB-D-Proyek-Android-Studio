package cobanavigasi.com;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DiaryFragment extends Fragment {

    private DiaryViewModel diaryViewModel;
    private Button btn;



    public DiaryFragment() {

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.diary_fragment, container, false);
        btn= root.findViewById(R.id.buttonNote);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent note = new Intent( getContext(), NoteActivity.class);
                startActivity(note);
            }
        });

        return root;

    }



}


