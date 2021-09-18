package news

import static news.GlobalConfig.*

class Member {
    Integer id
    String firstName
    String lastName
    String email
    String password
    String memberType = USER_TYPE.REGULAR_MEMBER
    String identityHash
    Long identityHashLastUpdate
    Boolean isActive = true

    Date dateCreated
    Date lastUpdated
    static hasMany = [news : News]

    static constraints = {
        email(blank: false,email: true,nullable: false,unique: true)
        password(blank: false)
        lastName(nullable: true)
        identityHash(nullable: true)
        identityHashLastUpdate(nullable: true)
    }
    def beforeInsert(){
        this.password = this.password.encodeAsMD5()
    }
    def beforeUpdate(){
        this.password = this.password.encodeAsMD5()
    }
}
