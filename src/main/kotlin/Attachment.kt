/*
В подсказе задачи 3 в строке
val attachment: Attachment = VideoAttachment("stuff")
вроде бы ошибка, т.к. параметром класс VideoAttachment принимает объект типа Video, а не String.
Если не прав - объясните пожалуйста
*/

sealed class Attachment(val type: String) {
    data class AudioAttachment(
        val audio: Audio
    ): Attachment("audio")

    data class PhotoAttachment(
        val photo: Photo
    ): Attachment("photo")

    data class VideoAttachment(
        val video: Video
    ): Attachment("video")

    data class FileAttachment(
        val file: File
    ): Attachment("file")

    data class StickerAttachment(
        val sticker: Sticker
    ): Attachment("sticker")
}

data class Audio(
    val id: Int,
    val artist: String,
    val title: String,
    val url: String?
)

data class Photo(
    val id: Int,
    val text: String,
)

data class Video(
    val id: Int,
    val title: String,
    val description: String?
)

data class File(
    val id: Int,
    val title: String,
    val size: Int,
    val url: String?
)

data class Sticker(
    val productId: Int,
    val stickerId: String
)