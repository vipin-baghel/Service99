package com.service99.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.facebook.drawee.view.SimpleDraweeView;
import com.service99.R;
import com.service99.ui.activities.CCTVActivity;
import com.service99.ui.activities.CarpenterActivity;
import com.service99.ui.activities.DriverOnDemand;
import com.service99.ui.activities.ElectricianActivity;
import com.service99.ui.activities.FabricationActivity;
import com.service99.ui.activities.PackersActivity;
import com.service99.ui.activities.PainterActivity;
import com.service99.ui.activities.PestControlActivity;
import com.service99.ui.activities.PlumberActivity;
import com.service99.ui.appliance.ApplianceActivity;
import com.service99.ui.business.BusinessActivity;
import com.service99.ui.cleaning.CleaningActivity;
import com.service99.ui.delivery.DeliveryActivity;
import com.service99.ui.image_slider.SliderAdapter;
import com.service99.ui.image_slider.SliderItem;
import com.service99.ui.salon.SalonActivity;
import com.service99.ui.utilities.Help;
import com.service99.ui.vehicle.CarDeepCleaningActivity;
import com.service99.ui.vehicle.CarRepairActivity;
import com.service99.ui.vehicle.CarServiceActivity;
import com.service99.ui.vehicle.CarWashActivity;
import com.service99.ui.vehicle.TwoWheelerActivity;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();
    private List<SliderItem> sliderItems = new ArrayList<>();
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager2 = root.findViewById(R.id.viewpager2);

        // setting all the images on home fragment
        loadhomeimageicons();
        // setting grid items clickable
        setGridItemsClickable();
        // Setting up image slider
        setupImageSlider();

        return root;
    }

    private void loadhomeimageicons() {
        //main services
        SimpleDraweeView i1 = root.findViewById(R.id.i1);
        SimpleDraweeView i2 = root.findViewById(R.id.i2);
        SimpleDraweeView i3 = root.findViewById(R.id.i3);
        SimpleDraweeView i4 = root.findViewById(R.id.i4);
        SimpleDraweeView i5 = root.findViewById(R.id.i5);
        SimpleDraweeView i6 = root.findViewById(R.id.i6);
        SimpleDraweeView i7 = root.findViewById(R.id.i7);
        SimpleDraweeView i8 = root.findViewById(R.id.i8);
        SimpleDraweeView i9 = root.findViewById(R.id.i9);
        SimpleDraweeView i10 = root.findViewById(R.id.i10);
        SimpleDraweeView i11 = root.findViewById(R.id.i11);
        SimpleDraweeView i12 = root.findViewById(R.id.i12);
        SimpleDraweeView i13 = root.findViewById(R.id.i13);

        i1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_salon.webp?alt=media&token=2fb16e16-d1a1-44c6-a007-9eef0bdd0a7b");
        i2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_electrician.webp?alt=media&token=065e1d48-ab1d-4063-b518-7e9814430a19");
        i3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_plumber.webp?alt=media&token=5a642af0-5715-4d0f-a0ec-eeea4952fee6");
        i4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_appliances.webp?alt=media&token=d1a280ce-809a-4ee0-a7b3-f6fb1ad8e4ee");
        i5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_carpenter.webp?alt=media&token=e83b8d7c-d9d7-44c9-9b40-ca598ea449f4");
        i6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_painter.webp?alt=media&token=104521b0-8283-43d2-8a49-32da4782bc98");
        i7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_cleaning.webp?alt=media&token=4b051224-9a72-4a0c-969a-35c17a9a5d1d");
        i8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_pestcontrol.webp?alt=media&token=2275ba8b-e210-444c-bccd-e78c227ff8c2");
        i9.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_packersmovers.webp?alt=media&token=95ce24a4-9705-4eb7-a18a-24ffc9f80ab7");
        i10.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_business.webp?alt=media&token=5880c567-e553-4e6b-8326-3e20e38e593b");
        i11.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_delivery.webp?alt=media&token=69068c85-2f5a-4d1c-b0be-31fdc17429b9");
        i12.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_driverondemand.webp?alt=media&token=53e4d64f-f040-4837-8c80-ec38d95110b7");
        i13.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_cctv.webp?alt=media&token=2d4e7529-c586-407c-819b-bc082680eb09");

        //construction services
        SimpleDraweeView ci1 = root.findViewById(R.id.ci1);
        SimpleDraweeView ci2 = root.findViewById(R.id.ci2);
        //SimpleDraweeView ci3 = root.findViewById(R.id.ci3);
        SimpleDraweeView ci4 = root.findViewById(R.id.ci4);
        SimpleDraweeView ci5 = root.findViewById(R.id.ci5);
        SimpleDraweeView ci6 = root.findViewById(R.id.ci6);
        SimpleDraweeView ci7 = root.findViewById(R.id.ci7);
        SimpleDraweeView ci8 = root.findViewById(R.id.ci8);
        //SimpleDraweeView ci9 = root.findViewById(R.id.ci9);
        //SimpleDraweeView ci10 = root.findViewById(R.id.ci10);
        SimpleDraweeView ci11 = root.findViewById(R.id.ci11);

        ci1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_flooring.webp?alt=media&token=934bc93f-30b7-4807-9f38-5c22c3c75eb3");
        ci2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_buildingstructure.webp?alt=media&token=ad0deb15-ae69-4894-8abb-8f081a392a6a");
        //ci3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_brick.webp?alt=media&token=2d8f27aa-1780-4048-9a7c-6f59acbf2534");
        ci4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_wallplaster.webp?alt=media&token=d393c2dc-44ee-4bc4-8b36-c86261a455e9");
        ci5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_modularkitchen.webp?alt=media&token=570991a6-1551-458f-96fd-9e79c9d42b5e");
        ci6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_falseceiling.webp?alt=media&token=06955ce4-d636-406b-b7e0-493830c26ac2");
        ci7.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_fabrication.webp?alt=media&token=0a966f66-8632-4c22-b1a5-697c7a7d3649");
        ci8.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_waterproofing.webp?alt=media&token=0a41160c-ab41-4e65-8aa5-ee2cf50b9318");
        //ci9.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_elevation.webp?alt=media&token=b3698d7b-7e81-4526-8f0f-9bcae5fd731b");
        //ci10.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_architect.webp?alt=media&token=584db34f-d71c-49ff-88f3-b1f14ab5b8fb");
        ci11.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_interior.webp?alt=media&token=14ea1aee-7762-42d5-b0b5-7f2c5750f9c8");

        // Vehicle services
        SimpleDraweeView vi1 = root.findViewById(R.id.vi1);
        SimpleDraweeView vi2 = root.findViewById(R.id.vi2);
        SimpleDraweeView vi3 = root.findViewById(R.id.vi3);
        SimpleDraweeView vi4 = root.findViewById(R.id.vi4);
        SimpleDraweeView vi5 = root.findViewById(R.id.vi5);

        vi1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_carwash.webp?alt=media&token=b2e3457d-7499-492a-bab5-e779dce8d94f");
        vi2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_twowheelerservicing.webp?alt=media&token=2d1bf72b-fbb3-4567-afbb-b4b38d86a93c");
        vi3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_carregularservicing.webp?alt=media&token=f4662ede-8f1f-4a57-a97d-ad89676e1c03");
        vi4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_carrepair.webp?alt=media&token=95fbecbe-21f3-4544-a131-20662bc9428f");
        vi5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_carinteriordetailing.webp?alt=media&token=9c72004a-7d6d-45b8-a352-02cc0e734017");

        //Event Services
        //SimpleDraweeView ei1 = root.findViewById(R.id.ei1);
        SimpleDraweeView ei2 = root.findViewById(R.id.ei2);
        //SimpleDraweeView ei3 = root.findViewById(R.id.ei3);
        //SimpleDraweeView ei4 = root.findViewById(R.id.ei4);
        //SimpleDraweeView ei5 = root.findViewById(R.id.ei5);
        //SimpleDraweeView ei6 = root.findViewById(R.id.ei6);

        //ei1.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_tent.webp?alt=media&token=b2237d52-8665-4ae8-886c-c4ec31698368");
        ei2.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_catering.webp?alt=media&token=e26010de-fe6a-4abe-997a-814e3d4e925b");
        //ei3.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_decoration.webp?alt=media&token=888966af-2709-40ce-b39c-b705e0f4e5df");
        //ei4.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_photographer.webp?alt=media&token=98f351c5-bf49-45de-8ce4-905a03695f49");
        //ei5.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_preweddingshoot.webp?alt=media&token=057999ae-f6ca-4b7b-87e8-b71c28b33a10");
        //ei6.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2F_makeupartist.webp?alt=media&token=89ef22e1-4d21-4f6a-9136-38b0036cfbbf");

        SimpleDraweeView happiness = root.findViewById(R.id.happiness);
        happiness.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2Fhappiness.webp?alt=media&token=e0e19f4f-d532-46bf-a464-b7338ed848a2");

        SimpleDraweeView proud = root.findViewById(R.id.proud);
        proud.setImageURI("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/_home_icons%2Fproud.webp?alt=media&token=8a6e2b49-7e67-4b2c-a78a-3f1a8ec4c3f7");

    }

    private void setGridItemsClickable() {
        LinearLayout l1 = root.findViewById(R.id.l1);
        PushDownAnim.setPushDownAnimTo(l1)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), SalonActivity.class));
                    }
                });
        LinearLayout l2 = root.findViewById(R.id.l2);
        PushDownAnim.setPushDownAnimTo(l2)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), ElectricianActivity.class));
                    }
                });
        LinearLayout l3 = root.findViewById(R.id.l3);
        PushDownAnim.setPushDownAnimTo(l3)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), PlumberActivity.class));
                    }
                });
        LinearLayout l4 = root.findViewById(R.id.l4);
        PushDownAnim.setPushDownAnimTo(l4)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), ApplianceActivity.class));
                    }
                });
        LinearLayout l5 = root.findViewById(R.id.l5);
        PushDownAnim.setPushDownAnimTo(l5)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), CarpenterActivity.class));
                    }
                });
        LinearLayout l6 = root.findViewById(R.id.l6);
        PushDownAnim.setPushDownAnimTo(l6)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), PainterActivity.class));
                    }
                });
        LinearLayout l7 = root.findViewById(R.id.l7);
        PushDownAnim.setPushDownAnimTo(l7)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), CleaningActivity.class));
                    }
                });
        LinearLayout l8 = root.findViewById(R.id.l8);
        PushDownAnim.setPushDownAnimTo(l8)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), PestControlActivity.class));
                    }
                });
        LinearLayout l9 = root.findViewById(R.id.l9);
        PushDownAnim.setPushDownAnimTo(l9)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), PackersActivity.class));

                    }
                });

        LinearLayout l10 = root.findViewById(R.id.l10);
        PushDownAnim.setPushDownAnimTo(l10)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), BusinessActivity.class));
                    }
                });

        LinearLayout l11 = root.findViewById(R.id.l11);
        PushDownAnim.setPushDownAnimTo(l11)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), DeliveryActivity.class));
                    }
                });

        LinearLayout l12 = root.findViewById(R.id.l12);
        PushDownAnim.setPushDownAnimTo(l12)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), DriverOnDemand.class));
                    }
                });

        LinearLayout l13 = root.findViewById(R.id.l13);
        PushDownAnim.setPushDownAnimTo(l13)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), CCTVActivity.class));
                    }
                });


        LinearLayout c1 = root.findViewById(R.id.c1);
        PushDownAnim.setPushDownAnimTo(c1)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Flooring & Polishing Work");
                    }
                });

        LinearLayout c2 = root.findViewById(R.id.c2);
        PushDownAnim.setPushDownAnimTo(c2)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Building Structural (RCC) Work");
                    }
                });

        /*LinearLayout c3 = root.findViewById(R.id.c3);
        PushDownAnim.setPushDownAnimTo(c3)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Bricking Work");
                    }
                });*/

        LinearLayout c4 = root.findViewById(R.id.c4);
        PushDownAnim.setPushDownAnimTo(c4)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\nWall Plaster Work ");
                    }
                });

        LinearLayout c5 = root.findViewById(R.id.c5);
        PushDownAnim.setPushDownAnimTo(c5)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Modular Kitchen");
                    }
                });

        LinearLayout c6 = root.findViewById(R.id.c6);
        PushDownAnim.setPushDownAnimTo(c6)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n False Ceiling & POP Work");
                    }
                });

        LinearLayout c7 = root.findViewById(R.id.c7);
        PushDownAnim.setPushDownAnimTo(c7)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getActivity(), FabricationActivity.class));
                    }
                });

        LinearLayout c8 = root.findViewById(R.id.c8);
        PushDownAnim.setPushDownAnimTo(c8)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Waterproofing");
                    }
                });

       /* LinearLayout c9 = root.findViewById(R.id.c9);
        PushDownAnim.setPushDownAnimTo(c9)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Elevation Work");
                    }
                });

        LinearLayout c10 = root.findViewById(R.id.c10);
        PushDownAnim.setPushDownAnimTo(c10)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Architect");
                    }
                });*/

        LinearLayout c11 = root.findViewById(R.id.c11);
        PushDownAnim.setPushDownAnimTo(c11)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Interior Design");
                    }
                });

        LinearLayout v1 = root.findViewById(R.id.v1);
        PushDownAnim.setPushDownAnimTo(v1)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getContext(), CarWashActivity.class));
                    }
                });

        LinearLayout v2 = root.findViewById(R.id.v2);
        PushDownAnim.setPushDownAnimTo(v2)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getContext(), TwoWheelerActivity.class));
                    }
                });

        LinearLayout v3 = root.findViewById(R.id.v3);
        PushDownAnim.setPushDownAnimTo(v3)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getContext(), CarServiceActivity.class));
                    }
                });

        LinearLayout v4 = root.findViewById(R.id.v4);
        PushDownAnim.setPushDownAnimTo(v4)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getContext(), CarRepairActivity.class));
                    }
                });

        LinearLayout v5 = root.findViewById(R.id.v5);
        PushDownAnim.setPushDownAnimTo(v5)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getContext(), CarDeepCleaningActivity.class));
                    }
                });

        /*LinearLayout e1 = root.findViewById(R.id.e1);
        PushDownAnim.setPushDownAnimTo(e1)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Wedding & Event Tent");
                    }
                });*/

        LinearLayout e2 = root.findViewById(R.id.e2);
        PushDownAnim.setPushDownAnimTo(e2)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Catering");
                    }
                });

        /*LinearLayout e3 = root.findViewById(R.id.e3);
        PushDownAnim.setPushDownAnimTo(e3)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Venue Decoration");
                    }
                });

        LinearLayout e4 = root.findViewById(R.id.e4);
        PushDownAnim.setPushDownAnimTo(e4)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Photographer");
                    }
                });

        LinearLayout e5 = root.findViewById(R.id.e5);
        PushDownAnim.setPushDownAnimTo(e5)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Pre-Wedding Shoot");
                    }
                });

        LinearLayout e6 = root.findViewById(R.id.e6);
        PushDownAnim.setPushDownAnimTo(e6)
                .setScale(0.8f)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Help.schedule(getActivity(), "Service:\n Make-up Artist");
                    }
                });*/

    }

    private void setupImageSlider() {

        sliderItems.add(new SliderItem("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/Top%20Slider%2Fac.jpeg?alt=media&token=3a3e7fc0-71c4-4f74-a607-39a079b02ee5"));
        sliderItems.add(new SliderItem("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/Top%20Slider%2Fbathroom.jpeg?alt=media&token=484389a5-657f-43b1-aa94-74ec4e71a16c"));
        sliderItems.add(new SliderItem("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/Top%20Slider%2Fplumber.jpeg?alt=media&token=15560d70-6284-4be0-a752-266c96681822"));
        sliderItems.add(new SliderItem("https://firebasestorage.googleapis.com/v0/b/serviceskart-b8177.appspot.com/o/Top%20Slider%2Fpest_control_slider.jpeg?alt=media&token=64bbdac5-586c-45a0-a2ca-f3e34872991f"));

        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2, getContext()));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(20));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.70f + r * 0.25f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);
        final ViewPager2.OnPageChangeCallback callback = new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 2000);
            }
        };
        viewPager2.registerOnPageChangeCallback(callback);

    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            if (viewPager2.getCurrentItem() == sliderItems.size() - 1) {
                viewPager2.setCurrentItem(0, true);
            } else {
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
            }
        }
    };

    @Override
    public void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    public void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 3000);
    }

}
