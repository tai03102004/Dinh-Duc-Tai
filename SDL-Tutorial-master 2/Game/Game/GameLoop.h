#pragma once
#include<SDL.h>
#include<SDL_image.h>
#include<iostream>
#include"Player.h"
#include"Background.h"

class GameLoop
{
private:
	Player p;
	Background b;
	Background ground1,ground2;
	const int HEIGHT = 600;
	const int WIDTH = 800;
	bool GameState;
	SDL_Window* window;
	SDL_Event event1;
	SDL_Renderer* renderer;
public:
	GameLoop();
	bool getGameState();
	void Update();
	void Intialize();
	void Event();
	void Render();
	void Clear();
};