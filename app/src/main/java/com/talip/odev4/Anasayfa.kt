import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.talip.odev4.R
import com.talip.odev4.databinding.FragmentAnasayfaBinding

class Anasayfa : Fragment() {
    private lateinit var tasarim : FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim =   FragmentAnasayfaBinding.inflate(inflater,container,false)




        tasarim.buttonA.setOnClickListener {

           Navigation.findNavController(it).navigate(R.id.anasayfa_a_gecis)

                }



        tasarim.buttonX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfa_x_gecis)
        }

        return tasarim.root

}

}