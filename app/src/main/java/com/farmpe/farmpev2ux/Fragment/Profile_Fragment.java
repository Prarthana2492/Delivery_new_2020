package com.farmpe.farmpev2ux.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import com.farmpe.farmpev2ux.R;

import java.io.IOException;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.app.Activity.RESULT_OK;


//Our class extending fragment
public class Profile_Fragment extends Fragment {

    LinearLayout profile_detail_arrow,back_feed,your_ratings_arrow,your_address,language;
    Fragment selectedFragment;
    TextView customer_address,customer_name,personal_details,bank_details,issue_details;
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


    public static Profile_Fragment newInstance() {
        Profile_Fragment itemOnFragment = new Profile_Fragment();
        return itemOnFragment;
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile, container, false);

        back_feed=view.findViewById(R.id.back_feed);
        personal_details=view.findViewById(R.id.personaldetails);
        bank_details=view.findViewById(R.id.bankdetails);
        your_address=view.findViewById(R.id.your_address);
        issue_details=view.findViewById(R.id.issue);
        image=view.findViewById(R.id.image_acc);
        user_name=view.findViewById(R.id.user_name_menu);
        profile_detail_arrow=view.findViewById(R.id.profile_detail_arrow);
        your_ratings_arrow=view.findViewById(R.id.your_ratings_arrow);
        language=view.findViewById(R.id.language);



        Window window = getActivity().getWindow();
        window.setStatusBarColor(ContextCompat.getColor(getActivity(), R.color.colorPrimaryDark));


        back_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedFragment = Home_Page_Fragment.newInstance();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout1, selectedFragment);
                transaction.commit();

            }
        });

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

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent();
                profileIntent.setType("image/*");
                profileIntent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(profileIntent, "Select Image."), PICK_IMAGE_REQUEST);
            }
        });





        your_ratings_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedFragment = Rating_Fragment.newInstance();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout1, selectedFragment);
                transaction.commit();

            }
        });

        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedFragment = Language_Setting_Page.newInstance();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout1, selectedFragment);
                transaction.commit();

            }
        });


        personal_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedFragment = Profile_Details_Fragment.newInstance();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout1, selectedFragment);
                transaction.commit();

            }
        });
        bank_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedFragment = Bank_Profile_Fragment.newInstance();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout1, selectedFragment);
                transaction.commit();

            }
        });

        your_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedFragment = Profile_Map_Fragment.newInstance();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout1, selectedFragment);
                transaction.commit();

            }
        });

        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                Log.i("ONBACK", "keyCodezzzzzzzzzq  : " + keyCode);
                if( keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                    Log.i("ONBACK", "onKey Back listener is working!!!");

                    selectedFragment = Home_Page_Fragment.newInstance();
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout1, selectedFragment);
                    transaction.commit();
                    return true;
                }
                return false;
            }
        });
        return view;
        
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK
                && data != null && data.getData() != null) {
            filePath = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), filePath);
                image.setImageBitmap(bitmap);
            //    uploadImage();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    private void uploadImage() {
//
//        if (filePath != null) {
//            final ProgressDialog progressDialog = new ProgressDialog(getActivity());
//            progressDialog.setTitle("Uploading...");
//            progressDialog.show();
//            System.out.println("uuuufgggggggggg "+sessionManager.getRegId("userId"));
//
//            StorageReference imageReference = mFirebaseStorage.getReference().child(sessionManager.getRegId("userId")).child(DEFAULT_PROFILE_PIC_DIRECTORY)
//                    .child(DEFAULT_PROFILE_PIC_NAME);
//            System.out.println("iasdhj "+imageReference);
//
//            UploadTask uploadTask = imageReference.putFile(filePath);
//            System.out.println("ljsdkj "+uploadTask);
//            uploadTask.addOnFailureListener(new OnFailureListener() {
//                @Override
//                public void onFailure(@NonNull Exception e) {
//                    progressDialog.dismiss();
//                    e.printStackTrace();
//                    Toast.makeText(getActivity(), "Failed", Toast.LENGTH_SHORT).show();
//
////                    onError(R.string.error_user_profile_pic_not_uploaded);
////                    navigateHomeScreen();
//                }
//            }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//                @Override
//                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                    progressDialog.dismiss();
//                    Toast.makeText(getActivity(), "Success", Toast.LENGTH_SHORT).show();
////                    showMessage(R.string.info_user_profile_pic_updated);
////                    navigateHomeScreen();
//
//                }
//            });
//
//
//        }
//    }

}
