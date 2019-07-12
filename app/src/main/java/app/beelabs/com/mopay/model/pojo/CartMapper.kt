package app.beelabs.com.mopay.model.pojo

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class CartMapper{
    var data: DataMapper? = null
}


