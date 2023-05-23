package kz.iitu.apiproject.data.model


import com.google.gson.annotations.SerializedName

data class arbeitnow(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("meta")
    val meta: Meta
) {
    data class Data(
        @SerializedName("company_name")
        val companyName: String,
        @SerializedName("created_at")
        val createdAt: Int,
        @SerializedName("description")
        val description: String,
        @SerializedName("job_types")
        val jobTypes: List<String>,
        @SerializedName("location")
        val location: String,
        @SerializedName("remote")
        val remote: Boolean,
        @SerializedName("slug")
        val slug: String,
        @SerializedName("tags")
        val tags: List<String>,
        @SerializedName("title")
        val title: String,
        @SerializedName("url")
        val url: String
    )

    data class Links(
        @SerializedName("first")
        val first: String,
        @SerializedName("last")
        val last: Any,
        @SerializedName("next")
        val next: String,
        @SerializedName("prev")
        val prev: Any
    )

    data class Meta(
        @SerializedName("current_page")
        val currentPage: Int,
        @SerializedName("from")
        val from: Int,
        @SerializedName("info")
        val info: String,
        @SerializedName("path")
        val path: String,
        @SerializedName("per_page")
        val perPage: Int,
        @SerializedName("terms")
        val terms: String,
        @SerializedName("to")
        val to: Int
    )
}