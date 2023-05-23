package kz.iitu.apiproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.iitu.apiproject.data.model.arbeitnow
import kz.iitu.apiproject.databinding.AdapterMainItemBinding

class MainActivityAdapter() : RecyclerView.Adapter<MainActivityAdapter.ViewHolder>() {

    private lateinit var listApi: List<arbeitnow.Data>

    inner class ViewHolder(private val binding:AdapterMainItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun initContent(item:arbeitnow.Data){
                binding.adapterText.text = item.companyName
                binding.adapterText2.text = item.title
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdapterMainItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listApi.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initContent(listApi[position])
    }

    fun submitList(list : List<arbeitnow.Data>){
        listApi = list;
    }

}