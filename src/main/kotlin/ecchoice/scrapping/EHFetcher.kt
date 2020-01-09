package ecchoice.scrapping

/**
 * This class' function is to request data to e-hentai's API.
 *
 * For information on the API's usage refer to [ehwiki](https://ehwiki.org/wiki/API).
 *
 * @author [Ignacio Slater Muñoz](islaterm@gmail.com)
 * @version 1.0.1.4
 * @since 1.0
 */
class EHFetcher {
  fun getGallery(link: String): EHGallery {
    return EHGallery(link, "", "", setOf())
  }

  /**
   * Parses the given ``url`` and returns a ``Pair<Long, String>`` containing the
   * _gallery id_ and the _gallery token_ respectively.
   */
  fun parseURL(url: String): Pair<Long, String> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}

/**
 * Data class that contains the metadata of a gallery from
 * [e-hentai](https://e-hentai.org)
 */
data class EHGallery(
  val link: String,
  val title: String,
  val thumbnailURL: String,
  val tags: Set<String>
)