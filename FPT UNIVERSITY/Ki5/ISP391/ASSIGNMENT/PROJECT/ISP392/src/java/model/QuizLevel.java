/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ADMIN
 */
@Builder
@Getter
@Setter
@ToString
public class QuizLevel {

    private int quizLevelId;
    private String quizLevelName;

    public QuizLevel() {
    }

    public QuizLevel(int quizLevelId, String quizLevelName) {
        this.quizLevelId = quizLevelId;
        this.quizLevelName = quizLevelName;
    }

}
