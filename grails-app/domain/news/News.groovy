package news

class News {
    Integer id
    String title
    String description
    byte[] image
    Member member
    String identityHash
    Long identityHashLastUpdate
    Date dateCreated
    Date lastUpdated
    boolean isPublish


    static constraints = {
        identityHash(nullable: true)
        identityHashLastUpdate(nullable: true)
        title(nullable: false)
        description(nullable: false)
        image(nullable: true, blank: true, maxSize: 1024*1024*20)
        isPublish(nullable: true)
    }

}
