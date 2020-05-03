package support.util

import android.content.Context
import fr.arnaudguyon.xmltojsonlib.XmlToJson
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.Charset

class FactoryData {

    companion object {
        private fun fetchXmlDataMapper(fileXml: String, context: Context): JSONObject? {
            val inputStream = context.assets.open(fileXml)
            val xmlToJson = XmlToJson.Builder(inputStream, null).build()
            inputStream.close()

            return xmlToJson.toJson()
        }

        private fun fetchJsonDataMapper(fileJson: String, context: Context): String? {
            try {
                val inputStream = context.assets.open(fileJson)
                var size = inputStream.available()
                var buffer: ByteArray = ByteArray(size)
                inputStream.read(buffer)
                inputStream.close()

                return String(buffer, Charset.forName("UTF-8"))
            } catch (ex: IOException) {
                ex.printStackTrace()
                return null
            }
        }

    }
}