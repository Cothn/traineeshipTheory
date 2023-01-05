package org.example.lombok1;

import lombok.*;
import lombok.NonNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(callSuper=true, includeFieldNames = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @NonNull
    @Setter(AccessLevel.NONE)
    @EqualsAndHashCode.Include
    private Integer id;

    @ToString.Include(rank = 1)
    @EqualsAndHashCode.Include
    private String nickname;

    @Getter(AccessLevel.PROTECTED)
    @ToString.Include(name="@mail")
    @EqualsAndHashCode.Include
    private String email;
    @Setter(AccessLevel.NONE)
    @NonNull
    private String password;
    @Getter(AccessLevel.PACKAGE)
    @ToString.Exclude
    private String passwordConfirm;


    public  User(User old) {
        this.id = old.id;
        this.nickname = old.nickname;
        this.email = old.email;
        this.password = old.password;
        this.passwordConfirm= old.passwordConfirm;
    }


}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper=true, includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
class UserExt extends User{
    private String role;
}