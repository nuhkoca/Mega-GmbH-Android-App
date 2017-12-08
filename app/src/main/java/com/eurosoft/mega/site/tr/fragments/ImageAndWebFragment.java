package com.eurosoft.mega.site.tr.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.eurosoft.mega.site.tr.adapters.CountriesAdapter;
import com.eurosoft.mega.site.tr.adapters.PartnersAdapter;
import com.eurosoft.mega.site.tr.adapters.ReferenceAdapter;
import com.eurosoft.mega.site.tr.models.Countries;
import com.eurosoft.mega.site.tr.models.ExternalSS;
import com.eurosoft.mega.site.tr.adapters.InternalAdapter;
import com.eurosoft.mega.site.tr.models.InternalSS;
import com.eurosoft.mega.site.tr.R;
import com.eurosoft.mega.site.tr.adapters.ExternalAdapter;
import com.eurosoft.mega.site.tr.models.Partners;
import com.eurosoft.mega.site.tr.models.References;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageAndWebFragment extends Fragment {


    protected String res;

    private ExternalAdapter externalAdapter;
    private InternalAdapter internalAdapter;
    private PartnersAdapter partnersAdapter;
    private ReferenceAdapter referenceAdapter;
    private CountriesAdapter countriesAdapter;

    private List<ExternalSS> externalSSes = new ArrayList<>();
    private List<InternalSS> internalSSes = new ArrayList<>();
    private List<Partners> partnerses = new ArrayList<>();
    private List<References> references = new ArrayList<>();
    private List<Countries> countries = new ArrayList<>();

    public static ImageAndWebFragment newInstance(String sectionId) {
        ImageAndWebFragment imageAndWebFragment = new ImageAndWebFragment();
        Bundle bundle = new Bundle();
        bundle.putString("fragmentName", sectionId);
        imageAndWebFragment.setArguments(bundle);
        return imageAndWebFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        res = getArguments().getString("fragmentName");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_iaw, container, false);

        RecyclerView rvSS = rootView.findViewById(R.id.rvSS);
        rvSS.setHasFixedSize(true);

        if (res.equals("EXS")) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            rvSS.setLayoutManager(gridLayoutManager);
            externalAdapter = new ExternalAdapter(externalSSes);
            rvSS.setAdapter(externalAdapter);
            prepareExternalSubsidiaries();
        }if (res.equals("INS")){
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            rvSS.setLayoutManager(gridLayoutManager);
            internalAdapter = new InternalAdapter(internalSSes);
            rvSS.setAdapter(internalAdapter);
            prepareInternalSubsidiaries();
        }if (res.equals("PAR")){
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            rvSS.setLayoutManager(gridLayoutManager);
            partnersAdapter = new PartnersAdapter(partnerses);
            rvSS.setAdapter(partnersAdapter);
            preparePartners();
        }
        if (res.equals("REF")){
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            rvSS.setLayoutManager(gridLayoutManager);
            referenceAdapter = new ReferenceAdapter(references);
            rvSS.setAdapter(referenceAdapter);
            prepareReferences();
        }
        if (res.equals("CON")){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            rvSS.setLayoutManager(linearLayoutManager);
            countriesAdapter = new CountriesAdapter(countries);
            rvSS.setAdapter(countriesAdapter);
            prepareCountries();
        }

        return rootView;
    }

    private void prepareCountries() {
        Countries c1 = new Countries("countries/tr.txt", R.drawable.tr);
        countries.add(c1);

        Countries c2 = new Countries("countries/kktc.txt", R.drawable.kktc);
        countries.add(c2);

        Countries c3 = new Countries("countries/de.txt", R.drawable.de);
        countries.add(c3);

        Countries c4 = new Countries("countries/at.txt", R.drawable.at);
        countries.add(c4);

        Countries c5 = new Countries("countries/pl.txt", R.drawable.pl);
        countries.add(c5);

        Countries c6 = new Countries("countries/uk.txt", R.drawable.uk);
        countries.add(c6);

        Countries c7 = new Countries("countries/gr.txt", R.drawable.gr);
        countries.add(c7);

        Countries c8 = new Countries("countries/be.txt", R.drawable.be);
        countries.add(c8);

        Countries c9 = new Countries("countries/bg.txt", R.drawable.bg);
        countries.add(c9);

        Countries c10 = new Countries("countries/es.txt", R.drawable.es);
        countries.add(c10);

        Countries c11 = new Countries("countries/nl.txt", R.drawable.nl);
        countries.add(c11);

        Countries c12 = new Countries("countries/ru.txt", R.drawable.ru);
        countries.add(c12);

        countriesAdapter.notifyDataSetChanged();
    }
    private void prepareExternalSubsidiaries(){
        ExternalSS es1 = new ExternalSS(R.drawable.ss1, "http://www.010012.com/");
        externalSSes.add(es1);

        ExternalSS es2 = new ExternalSS(R.drawable.ss2, "http://www.11883.com/");
        externalSSes.add(es2);

        ExternalSS es3 = new ExternalSS(R.drawable.ss3, "http://www.01057.com/");
        externalSSes.add(es3);

        ExternalSS es4 = new ExternalSS(R.drawable.ss4, "http://www.euroauskunft.com/");
        externalSSes.add(es4);

        ExternalSS es5 = new ExternalSS(R.drawable.ss5, "http://www.mega24.com/");
        externalSSes.add(es5);

        ExternalSS es6 = new ExternalSS(R.drawable.ss6, "http://www.megasat.de/index.php?lan=de&show=toechter&artikel_id=9&PHPSESSID=2ace1ca2eed607ab87eccbb0fed899ab");
        externalSSes.add(es6);

        ExternalSS es7 = new ExternalSS(R.drawable.ss7, "http://www.divaavrupa.com/");
        externalSSes.add(es7);

        ExternalSS es8 = new ExternalSS(R.drawable.ss8, "http://www.aegean-media.com/");
        externalSSes.add(es8);

        ExternalSS es9 = new ExternalSS(R.drawable.ss9, "http://www.gtvweb.tv/");
        externalSSes.add(es9);

        ExternalSS es10 = new ExternalSS(R.drawable.ss10, "http://www.fortel.de/");
        externalSSes.add(es10);

        ExternalSS es11 = new ExternalSS(R.drawable.ss11, "http://www.usfilm.de/");
        externalSSes.add(es11);

        ExternalSS es12 = new ExternalSS(R.drawable.ss12, "http://www.megaglobus.com/");
        externalSSes.add(es12);

        ExternalSS es13 = new ExternalSS(R.drawable.ss13, "");
        externalSSes.add(es13);

        ExternalSS es14 = new ExternalSS(R.drawable.ss14, "http://www.airboxtv.com/");
        externalSSes.add(es14);

        ExternalSS es15 = new ExternalSS(R.drawable.ss15, "http://www.gigamms.com/");
        externalSSes.add(es15);

        ExternalSS es16 = new ExternalSS(R.drawable.ss16, "");
        externalSSes.add(es16);

        ExternalSS es17 = new ExternalSS(R.drawable.ss17, "http://www.megabusiness24.tv/");
        externalSSes.add(es17);

        ExternalSS es18 = new ExternalSS(R.drawable.ss18, "");
        externalSSes.add(es18);

        externalAdapter.notifyDataSetChanged();
    }
    private void prepareInternalSubsidiaries(){
        InternalSS is1 = new InternalSS(R.drawable.is1, "http://www.11881.com.tr/");
        internalSSes.add(is1);

        InternalSS is2 = new InternalSS(R.drawable.is2, "http://www.11883.com.tr/");
        internalSSes.add(is2);

        InternalSS is3 = new InternalSS(R.drawable.is3, "http://www.finest.tv/");
        internalSSes.add(is3);

        InternalSS is4 = new InternalSS(R.drawable.is4, "http://www.divamagazin.com/");
        internalSSes.add(is4);

        InternalSS is5 = new InternalSS(R.drawable.is5, "http://www.smyrnamendil.com/");
        internalSSes.add(is5);

        InternalSS is6 = new InternalSS(R.drawable.is6, "http://www.batipak.com.tr/");
        internalSSes.add(is6);

        InternalSS is7 = new InternalSS(R.drawable.is7, "http://www.navimega.com/");
        internalSSes.add(is7);

        InternalSS is8 = new InternalSS(R.drawable.is8, "http://www.marsymms.com/");
        internalSSes.add(is8);

        InternalSS is9 = new InternalSS(R.drawable.is9, "http://www.gigamms.com/");
        internalSSes.add(is9);

        InternalSS is10 = new InternalSS(R.drawable.is10, "http://www.mobimag.com/");
        internalSSes.add(is10);

        InternalSS is11 = new InternalSS(R.drawable.is11, "http://www.bantmag.com/");
        internalSSes.add(is11);

        InternalSS is12 = new InternalSS(R.drawable.is12, "http://www.airboxtv.com/");
        internalSSes.add(is12);

        InternalSS is13 = new InternalSS(R.drawable.is13, "http://www.planetstudyo.com/");
        internalSSes.add(is13);

        InternalSS is14 = new InternalSS(R.drawable.is14, "http://www.eurotechmultimedia.com/");
        internalSSes.add(is14);

        InternalSS is15 = new InternalSS(R.drawable.is15, "http://www.eurosoftmultimedia.com/");
        internalSSes.add(is15);

        InternalSS is16 = new InternalSS(R.drawable.is16, "http://www.telemesaj.com/");
        internalSSes.add(is16);

        InternalSS is17 = new InternalSS(R.drawable.is17, "http://vy.megatelekom.com.tr/");
        internalSSes.add(is17);

        InternalSS is18 = new InternalSS(R.drawable.is18, "http://www.varol.io/");
        internalSSes.add(is18);

        InternalSS is19 = new InternalSS(R.drawable.is19, "http://www.minikpilot.com/");
        internalSSes.add(is19);

        InternalSS is20 = new InternalSS(R.drawable.is20, "http://www.minikpilot.com/");
        internalSSes.add(is20);

        internalAdapter.notifyDataSetChanged();
    }
    private void preparePartners() {
        Partners p1 = new Partners(R.drawable.p1, "http://www.megasat.de/index.php?lan=de&show=toechter&artikel_id=9&PHPSESSID=2ace1ca2eed607ab87eccbb0fed899ab");
        partnerses.add(p1);

        Partners p2 = new Partners(R.drawable.p2, "");
        partnerses.add(p2);

        Partners p3 = new Partners(R.drawable.p3, "http://www.rgand.com/");
        partnerses.add(p3);

        Partners p4 = new Partners(R.drawable.p4, "http://www.dell.com/");
        partnerses.add(p4);

        Partners p5 = new Partners(R.drawable.p5, "");
        partnerses.add(p5);

        Partners p6 = new Partners(R.drawable.p6, "http://www.aculab.com/");
        partnerses.add(p6);

        Partners p7 = new Partners(R.drawable.p7, "");
        partnerses.add(p7);

        Partners p8 = new Partners(R.drawable.p8, "");
        partnerses.add(p8);

        Partners p9 = new Partners(R.drawable.p9, "");
        partnerses.add(p9);

        Partners p10 = new Partners(R.drawable.p10, "http://www.asterisk.org/");
        partnerses.add(p10);

        Partners p11 = new Partners(R.drawable.p11, "http://www.veraznetworks.com/");
        partnerses.add(p11);

        Partners p12 = new Partners(R.drawable.p12, "http://www.digitalk.com/");
        partnerses.add(p12);

        Partners p13 = new Partners(R.drawable.p13, "http://www.vartex.de/");
        partnerses.add(p13);

        Partners p14 = new Partners(R.drawable.p14, "http://www.megatelekom.com.tr/www.elkotek.com.tr");
        partnerses.add(p14);

        Partners p15 = new Partners(R.drawable.p15, "http://www.strom.cz/");
        partnerses.add(p15);

        partnersAdapter.notifyDataSetChanged();
    }
    private void prepareReferences() {
        References r1 = new References(R.drawable.r1, "http://www.publicisyorum.com/");
        references.add(r1);

        References r2 = new References(R.drawable.r2, "http://ring.de/");
        references.add(r2);

        References r3 = new References(R.drawable.r3, "http://www.callax.net/");
        references.add(r3);

        References r4 = new References(R.drawable.r4, "");
        references.add(r4);

        References r5 = new References(R.drawable.r5, "http://www.01030.com/");
        references.add(r5);

        References r6 = new References(R.drawable.r6, "http://www.01077.com/");
        references.add(r6);

        References r7 = new References(R.drawable.r7, "http://www.wavecrestcom.com/");
        references.add(r7);

        References r8 = new References(R.drawable.r8, "http://t-mobile.com/");
        references.add(r8);

        References r9 = new References(R.drawable.r9, "");
        references.add(r9);

        References r10 = new References(R.drawable.r10, "http://www.telekom.com/");
        references.add(r10);

        References r11 = new References(R.drawable.r11, "http://www.r-talk.de/");
        references.add(r11);

        References r12 = new References(R.drawable.r12, "");
        references.add(r12);

        References r13 = new References(R.drawable.r13, "http://www.ibasis.com/");
        references.add(r13);

        References r14 = new References(R.drawable.r14, "http://www.turksat.com.tr/");
        references.add(r14);

        References r15 = new References(R.drawable.r15, "");
        references.add(r15);

        References r16 = new References(R.drawable.r16, "http://www.globalcrossing.com/");
        references.add(r16);

        References r17 = new References(R.drawable.r17, "http://www.proximus.be/");
        references.add(r17);

        References r18 = new References(R.drawable.r18, "http://www.mobistar.be/");
        references.add(r18);

        References r19 = new References(R.drawable.r19, "http://www.belgacom.be/");
        references.add(r19);

        References r20 = new References(R.drawable.r20, "http://www.base.be/");
        references.add(r20);

        References r21 = new References(R.drawable.r21, "http://www.01058.com/");
        references.add(r21);

        References r22 = new References(R.drawable.r22, "http://www.coltethernet.com/");
        references.add(r22);

        References r23 = new References(R.drawable.r23, "http://www.bt.com/");
        references.add(r23);

        References r24 = new References(R.drawable.r24, "http://www.texaspackage.com/");
        references.add(r24);

        References r25 = new References(R.drawable.r25, "http://www.telecall.jp/");
        references.add(r25);

        References r26 = new References(R.drawable.r26, "http://www.vodafone.com/");
        references.add(r26);

        References r27 = new References(R.drawable.r27, "http://www.tellas.gr/");
        references.add(r27);

        References r28 = new References(R.drawable.r28, "http://www.cosmote.gr/");
        references.add(r28);

        References r29 = new References(R.drawable.r29, "http://www.wind.com.gr/");
        references.add(r29);

        References r30 = new References(R.drawable.r30, "http://www.wind.com.gr/");
        references.add(r30);

        References r31 = new References(R.drawable.r31, "http://www.mobiltek.pl/");
        references.add(r31);

        References r32 = new References(R.drawable.r32, "http://www.netia.pl/");
        references.add(r32);

        References r33 = new References(R.drawable.r33, "http://www.orange.com/");
        references.add(r33);

        References r34 = new References(R.drawable.r34, "http://www.oxygen8.com/");
        references.add(r34);

        References r35 = new References(R.drawable.r35, "http://www.plus.pl/");
        references.add(r35);

        References r36 = new References(R.drawable.r36, "http://www.playmobile.pl/");
        references.add(r36);

        References r37 = new References(R.drawable.r37, "http://www.pksjedrzejow.pl/");
        references.add(r37);

        References r38 = new References(R.drawable.r38, "http://www.chellozone.com/");
        references.add(r38);

        References r39 = new References(R.drawable.r39, "http://www.fortis.com.tr/");
        references.add(r39);

        References r40 = new References(R.drawable.r40, "http://www.tp.pl/");
        references.add(r40);

        References r41 = new References(R.drawable.r41, "http://www.megatelekom.com.tr/www.francetelecom.fr");
        references.add(r41);

        References r42 = new References(R.drawable.r42, "http://www.telekom.hu/");
        references.add(r42);

        References r43 = new References(R.drawable.r43, "http://www.telekom.at/");
        references.add(r43);

        References r44 = new References(R.drawable.r44, "http://www.commerzbank.de/");
        references.add(r44);

        References r45 = new References(R.drawable.r45, "http://www.isbank.com.tr/");
        references.add(r45);

        References r46 = new References(R.drawable.r46, "http://www.garanti.com.tr/");
        references.add(r46);

        References r47 = new References(R.drawable.r47, "http://www.ziraat.com.tr/");
        references.add(r47);

        referenceAdapter.notifyDataSetChanged();
    }
}
