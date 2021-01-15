package com.farmpe.farmpev2ux.Fragment;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


import com.farmpe.farmpev2ux.R;

import de.hdodenhof.circleimageview.CircleImageView;


//Our class extending fragment
public class Profile_Details_Fragment extends Fragment {

    LinearLayout pick_up_arrow, back_feed, reached_loc;
    Fragment selectedFragment;
    TextView id_card, customer_address, customer_name, personal_details, bank_details, issue_details;
    //    private DatabaseReference mDatabaseReference;
//    private FirebaseAuth mFirebaseAuth;
//    private FirebaseDatabase mFirebaseDatabase;
//    private FirebaseStorage mFirebaseStorage;
//    private FirebaseUser mActiveUser;
    CircleImageView image;
    TextView user_name;
    private final int PICK_IMAGE_REQUEST = 71;
    private Uri filePath;
    // SessionManager sessionManager;


    public static Profile_Details_Fragment newInstance() {
        Profile_Details_Fragment itemOnFragment = new Profile_Details_Fragment();
        return itemOnFragment;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile_details_page, container, false);


        Window window = getActivity().getWindow();
        window.setStatusBarColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryDark));

//        sessionManager=new SessionManager(getActivity());
//        mFirebaseAuth = FirebaseAuth.getInstance();
//        mActiveUser = mFirebaseAuth.getCurrentUser();
//
//        mDatabaseReference = FirebaseDatabase.getInstance().getReference();
//        mFirebaseDatabase = FirebaseDatabase.getInstance();
//        mFirebaseStorage = FirebaseStorage.getInstance();

        //  DatabaseReference databaseReference = mFirebaseDatabase.getReference(mFirebaseAuth.getUid());

      /*  if (mFirebaseAuth.getCurrentUser()!=null) {


            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    User userProfile = dataSnapshot.child("Users").getValue(User.class);

                    user_name.setText(userProfile.getFirstName());
//                System.out.println("nameeeeeeeeeeeeee"+userProfile.getFirstName());
                    //  mEditJoiningDate.setText(userProfile.getLastName());
                    //  mEditMobile.setText(userProfile.getMobileNumber());
                    // mTextEmail.setText(mActiveUser.getEmail());
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    // onError(databaseError.getMessage());
                    Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            });
        }else{

        }*/
//        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(mFirebaseAuth.getUid());
        // mDatabaseReference.child(mFirebaseAuth.getCurrentUser().getUid()).child(DEFAULT_PROFILE_PIC_DIRECTORY).child(DEFAULT_PROFILE_PIC_NAME);
        //  mDatabaseReference.child(sessionManager.getRegId("userId")).child(DEFAULT_PROFILE_PIC_DIRECTORY).child(DEFAULT_PROFILE_PIC_NAME);
        //   StorageReference storageReference = FirebaseStorage.getInstance().getReference();

//        storageReference.child(sessionManager.getRegId("userId")).child(DEFAULT_PROFILE_PIC_DIRECTORY).child(DEFAULT_PROFILE_PIC_NAME)
//                .getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//            @Override
//            public void onSuccess(Uri uri) {
//                Picasso.get().load(uri).fit().centerInside().into(image);
//            }
//        });
//        DatabaseReference databaseReference = mFirebaseDatabase.getReference(sessionManager.getRegId("userId"));
//        if(sessionManager.getRegId("userId")!=null) {
//            databaseReference.addValueEventListener(new ValueEventListener() {
//                @Override
//                public void onDataChange(DataSnapshot dataSnapshot) {
//                    User userProfile = dataSnapshot.child(TABLE_USERS).getValue(User.class);
//
//                    user_name.setText(userProfile.getFirstName());
//
//                }
//
//                @Override
//                public void onCancelled(DatabaseError databaseError) {
//                    // onError(databaseError.getMessage());
//                    Toast.makeText(getActivity(), "Something went wrong", Toast.LENGTH_SHORT).show();
//                }
//            });
//        }else{
//
//        }


        return view;
    }

}
