package com.example.demo;

import com.example.demo.model.ScoreCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(DemoApplication.class, args);
		cricketMatch();
	}

	public static void cricketMatch() throws IOException {
		int numberOfPlayers, numberOfOvers;
		int[] grandScore = new int[2];
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("No. of players for each team: ");
		numberOfPlayers = Integer.parseInt(input.readLine());
		System.out.println("No. of overs: ");
		numberOfOvers = Integer.parseInt(input.readLine());
		List<List<ScoreCard>> innings = new ArrayList<>();
		for (int i = 1; i <= 2; i++) {
			grandScore[i-1] = 0;
			List<ScoreCard> scorecardList = new ArrayList<>();
			System.out.println("Batting Order for team "+i+":" );
			for (int j = 1; j <= numberOfPlayers; j++) {
				scorecardList.add(new ScoreCard("P" + j,0,0,0,0));
				System.out.println("P" + j);
			}
			for (int k = 1; k <= numberOfOvers; k++) {
				List<String> singleOver = new ArrayList<>();
				System.out.println("Over " + k);

				singleOver = Stream.of(input.readLine().replaceAll("\\s+$", "").split(" "))
						.collect(Collectors.toList());
				System.out.println("singleOver" + singleOver);
				for (int l = 1; l <= singleOver.size(); l++) {
					String singleBall = singleOver.get(l);
					if(singleBall.equalsIgnoreCase("WD") || singleBall.equalsIgnoreCase("NB")){
						grandScore[i-1]++ ;
					} else if (singleBall.equalsIgnoreCase("W")) {

					}
				}

			}
		}
	}

}
